package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.dto.SetmealDto;
import zhuxuanyu.reggie.generator.entity.Setmeal;
import zhuxuanyu.reggie.generator.service.CategoryService;
import zhuxuanyu.reggie.generator.service.SetmealDishService;
import zhuxuanyu.reggie.generator.service.SetmealService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @title: SetmealController
 * @Author 竹玄羽
 * @Date: 2023/2/19 18:18
 * 套餐管理
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@Api(tags = "套餐相关接口")
@RequestMapping("/setmeal")
public class SetmealController {
    private final SetmealService setmealService;

    private final SetmealDishService setmealDishService;

    private final CategoryService categoryService;
    /**
     * 保存套餐
     * @param setmealDto
     * @return
     */
    @PostMapping
    @CacheEvict(value = "setmealCache",key = "#setmealDto.categoryId+'_'+1")
    public Result<String> save(@RequestBody SetmealDto setmealDto){
        log.info("setmealDto:{}",setmealDto);
        setmealService.saveWithDish(setmealDto);
        return Result.success("套餐保存成功！");
    }

    /**
     * 套餐分页查询
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/page")
    @ApiOperation("套餐分页查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页码",required = true),
            @ApiImplicitParam(name = "pageSize",value = "每页大小",required = true),
            @ApiImplicitParam(name = "name",value = "查询条件",required = false)
    })
    public Result<Page<SetmealDto>> page(int page,int pageSize,String name){
        Page<Setmeal> pageInfo = new Page<>(page,pageSize);
        Page<SetmealDto> myPage = new Page<>(page,pageSize);
        LambdaQueryWrapper<Setmeal> wrapper = new LambdaQueryWrapper<>();
        //添加查询条件
        wrapper.like(name!=null,Setmeal::getName,name);
        wrapper.orderByDesc(Setmeal::getUpdateTime);
        setmealService.page(pageInfo,wrapper);

        BeanUtils.copyProperties(pageInfo,myPage);
        List<SetmealDto> list = pageInfo.getRecords().stream().map(item->{
            SetmealDto setmealDto = new SetmealDto();
            BeanUtils.copyProperties(item,setmealDto);
            setmealDto.setCategoryName(categoryService.getById(item.getCategoryId()).getName());
            return setmealDto;
        }).collect(Collectors.toList());

        myPage.setRecords(list);
        return Result.success(myPage);
    }


    /**
     * 获取单个的套餐信息
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<SetmealDto> getInfo(@PathVariable Long id){
        SetmealDto setmealDto = setmealService.getByIdWithDish(id);
        return Result.success(setmealDto);
    }

    /**
     * 删除/批量删除
     */
    @DeleteMapping
    @CacheEvict(value = "setmealCache",allEntries = true)
    public Result<String> delete(@RequestParam("ids") List<Long> list){
        setmealService.removeWithDish(list);
return Result.success("删除成功！");
    }

    /**
     * 更改套餐状态
     * @param status 状态
     * @param list 参数列表
     * @return 返回是否成功
     */
    @PostMapping("/status/{status}")
    public Result<String> state(@PathVariable Integer status, @RequestParam("ids") Long[] list){
        log.info("list:{}",list);
        LambdaQueryWrapper<Setmeal> wrapper = new LambdaQueryWrapper<>();
        for (Long item : list) {
             Setmeal setmeal = setmealService.getById(item);
            setmeal.setStatus(status);
            wrapper.eq(Setmeal::getId,item);
            setmealService.update(setmeal,wrapper);
            wrapper.clear();
        }
        return Result.success("状态修改成功！");
    }


    /**
     * 批量获取套餐数据
     * @param setmeal 套餐
     * @return 返回套餐列表
     */
    @GetMapping("/list")
    @Cacheable(value = "setmealCache",key = "#setmeal.categoryId + '_' + #setmeal.status")
    public Result<List<Setmeal>> list(Setmeal setmeal) {
        LambdaQueryWrapper<Setmeal> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(setmeal.getCategoryId() != null, Setmeal::getCategoryId, setmeal.getCategoryId());
        wrapper.eq(Setmeal::getStatus, 1);
        wrapper.orderByDesc(Setmeal::getUpdateTime);
        List<Setmeal> setmealList = setmealService.list(wrapper);
        return Result.success(setmealList);
    }
}
