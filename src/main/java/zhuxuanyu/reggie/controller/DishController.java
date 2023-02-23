package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.dto.DishDto;
import zhuxuanyu.reggie.generator.entity.Dish;
import zhuxuanyu.reggie.generator.service.CategoryService;
import zhuxuanyu.reggie.generator.service.DishFlavorService;
import zhuxuanyu.reggie.generator.service.DishService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @title: DishController
 * @Author 竹玄羽
 * @Date: 2023/2/18 16:11
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {
    private final DishService dishService;

    private final DishFlavorService dishFlavorService;

    private final CategoryService categoryService;

    private final RedisTemplate<Object, Object> redisTemplate;

    @PostMapping
    public Result<String> save(@RequestBody DishDto dishDto) {
        log.info("dishDto:{}", dishDto);
        dishService.saveWithFlavor(dishDto);

        cleanCache(dishDto.getCategoryId());

        return Result.success("添加菜品成功！");
    }

    /**
     * 清理菜品分类的redis缓存
     * @param id 菜品分类id
     */
    private void cleanCache(Long id) {
        String key = id + "_1";
        redisTemplate.delete("dishCache::" + key);
    }

    @GetMapping("/page")
    public Result<Page<DishDto>> page(int page, int pageSize, String name) {
        //构造分页构造器
        Page<Dish> pageInfo = new Page<>(page, pageSize);
        Page<DishDto> dishDtoPage = new Page<>(page, pageSize);

        //条件构造器
        LambdaQueryWrapper<Dish> wrapper = new LambdaQueryWrapper<>();

        //添加过滤条件
        wrapper.like(name != null, Dish::getName, name);
        wrapper.orderByDesc(Dish::getUpdateTime);

        //执行分页查询
        dishService.page(pageInfo, wrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo, dishDtoPage);

        List<DishDto> list = pageInfo.getRecords().stream().map(item -> {
            DishDto dishDto = new DishDto();
            BeanUtils.copyProperties(item, dishDto);
            dishDto.setCategoryName(categoryService.getById(item.getCategoryId()).getName());
            return dishDto;
        }).collect(Collectors.toList());

        dishDtoPage.setRecords(list);

        return Result.success(dishDtoPage);
    }

    /**
     * 根据id查询菜品信息
     *
     * @param id 菜品Id
     * @return 返回DishDto
     */
    @GetMapping("/{id}")
    public Result<DishDto> getInfo(@PathVariable Long id) {
        return Result.success(dishService.getByIdWithFlavor(id));
    }

    /**
     * 修改菜品
     *
     * @param dishDto 传入json参数
     * @return 返回结果
     */
    @PutMapping
    public Result<String> update(@RequestBody DishDto dishDto) {
        log.info("dishDto:{}", dishDto);
        dishService.updateWithFlavor(dishDto);
        cleanCache(dishDto.getCategoryId());
        return Result.success("修改成功！");
    }

    /**
     * 更改菜品状态
     *
     * @param status
     * @param list
     * @return
     */
    @PostMapping("/status/{status}")
    public Result<String> state(@PathVariable Integer status, @RequestParam("ids") Long[] list) {
        log.info("list:{}", list);
        LambdaQueryWrapper<Dish> wrapper = new LambdaQueryWrapper<>();
        for (Long item : list) {
            Dish dish = dishService.getById(item);
            dish.setStatus(status);
            wrapper.eq(Dish::getId, item);
            dishService.update(dish, wrapper);
            cleanCache(dish.getCategoryId());
            wrapper.clear();
        }
        return Result.success("状态修改成功！");
    }

    /**
     * 删除dish
     *
     * @param list
     * @return
     */
    @DeleteMapping
    @CacheEvict(value = "dishCache", allEntries = true)
    public Result<String> delete(@RequestParam("ids") List<Long> list) {
        dishService.removeWithFlavor(list);
        return Result.success("删除成功！");
    }

    @GetMapping("/list")
    @Cacheable(value = "dishCache", key = "#dish.categoryId + '_' + #dish.status")
    public Result<List<DishDto>> list(Dish dish) {
        LambdaQueryWrapper<Dish> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(dish.getCategoryId() != null, Dish::getCategoryId, dish.getCategoryId());
        wrapper.eq(Dish::getStatus, 1);
        wrapper.orderByAsc(Dish::getSort).orderByDesc(Dish::getUpdateTime);
        List<Dish> dishList = dishService.list(wrapper);
        List<DishDto> dishDtoList = dishList.stream().map(item -> {
            DishDto dishDto = null;
            Long id = item.getId();
            dishDto = dishService.getByIdWithFlavor(id);
            BeanUtils.copyProperties(item, dishDto);
            return dishDto;
        }).collect(Collectors.toList());

        return Result.success(dishDtoList);
    }
}
