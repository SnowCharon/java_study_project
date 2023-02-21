package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zhuxuanyu.reggie.common.CustomException;
import zhuxuanyu.reggie.generator.entity.Category;
import zhuxuanyu.reggie.generator.entity.Dish;
import zhuxuanyu.reggie.generator.entity.Setmeal;
import zhuxuanyu.reggie.generator.mapper.CategoryMapper;
import zhuxuanyu.reggie.generator.service.CategoryService;
import zhuxuanyu.reggie.generator.service.DishService;
import zhuxuanyu.reggie.generator.service.SetmealService;

/**
* @author zhuxuanyu
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

    private final DishService dishService;
    private final SetmealService setmealService;

    /**
     * 根据id删除菜品，要对关联进行检验
     * @param id
     */
    @Override
    public void remove(Long id){
        //查询当前分类是否关联菜品,如果关联抛出业务异常
        LambdaQueryWrapper<Dish> dishWrapper = new LambdaQueryWrapper<>();
        dishWrapper.eq(Dish::getCategoryId,id);
        long countDish = dishService.count(dishWrapper);
        if (countDish>0){
            throw new CustomException("当前分类下关联了菜品，不能删除！");
        }
        //查询当前分类是否关联套餐,如果关联抛出业务异常
        LambdaQueryWrapper<Setmeal> setmealWrapper = new LambdaQueryWrapper<>();
        setmealWrapper.eq(Setmeal::getCategoryId,id);
        long countSetmeal = setmealService.count(setmealWrapper);
        if (countSetmeal>0){
            throw new CustomException("当前分类下关联了套餐，不能删除！");
        }
        //删除分类
        super.removeById(id);
    }
}




