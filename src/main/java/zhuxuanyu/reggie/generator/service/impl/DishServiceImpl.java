package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import zhuxuanyu.reggie.common.CustomException;
import zhuxuanyu.reggie.dto.DishDto;
import zhuxuanyu.reggie.generator.entity.Dish;
import zhuxuanyu.reggie.generator.entity.DishFlavor;
import zhuxuanyu.reggie.generator.mapper.DishMapper;
import zhuxuanyu.reggie.generator.service.DishFlavorService;
import zhuxuanyu.reggie.generator.service.DishService;

import java.util.List;

/**
 * @author zhuxuanyu
 * @description 针对表【dish(菜品管理)】的数据库操作Service实现
 * @createDate 2023-02-16 10:16:50
 */
@Service
@RequiredArgsConstructor
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
        implements DishService {
    private final DishFlavorService dishFlavorService;

    /**
     * 新增菜品与口味
     */
    @Override
    public void saveWithFlavor(DishDto dishDto) {
        //保存基本信息到菜品表
        this.save(dishDto);
        //菜品Id
        Long dishId = dishDto.getId();
        //保存口味信息到口味表
        //菜品口味
        for (DishFlavor flavor : dishDto.getFlavors()) {
            flavor.setDishId(dishId);
        }

        dishFlavorService.saveBatch(dishDto.getFlavors());
    }

    /**
     * 根据id获取到菜品信息和口味
     *
     * @param id
     * @return
     */
    @Override
    public DishDto getByIdWithFlavor(Long id) {
        //查询菜品基本信息
        Dish dish = this.getById(id);
        DishDto dishDto = new DishDto();
        BeanUtils.copyProperties(dish, dishDto);
        //查询口味
        LambdaQueryWrapper<DishFlavor> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(DishFlavor::getDishId, dish.getId());
        List<DishFlavor> flavorList = dishFlavorService.list(wrapper);
        dishDto.setFlavors(flavorList);

        return dishDto;
    }

    @Override
    public void updateWithFlavor(DishDto dishDto) {
        // 更新dish表
        this.updateById(dishDto);
        // 清理当前口味，再添加
        Long dishId = dishDto.getId();
        LambdaQueryWrapper<DishFlavor> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(DishFlavor::getDishId, dishId);
        if (dishFlavorService.count(wrapper) > 0) {
            dishFlavorService.remove(wrapper);
        }

        // 添加新的
        List<DishFlavor> flavors = dishDto.getFlavors();
        if (flavors != null && !flavors.isEmpty()) {
            flavors.forEach(flavor -> flavor.setDishId(dishId));
            dishFlavorService.saveBatch(flavors);
        }
    }

    @Override
    public void removeWithFlavor(List<Long> list) {

        //先判断是否是启售
        LambdaQueryWrapper<Dish> dishWrapper = new LambdaQueryWrapper<>();
        dishWrapper.in(Dish::getId, list);
        dishWrapper.eq(Dish::getStatus,1);
        if (this.count(dishWrapper) > 0){
            throw new CustomException("要删除的菜品有正在销售中的，无法删除！");
        }
        //可以删除再删除
        this.removeByIds(list);

        LambdaQueryWrapper<DishFlavor> dishFlavorWrapper = new LambdaQueryWrapper<>();
        dishFlavorWrapper.in(DishFlavor::getDishId,  list);
        dishFlavorService.remove(dishFlavorWrapper);
    }
}




