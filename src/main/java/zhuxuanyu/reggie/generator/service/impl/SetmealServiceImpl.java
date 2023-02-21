package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import zhuxuanyu.reggie.common.CustomException;
import zhuxuanyu.reggie.dto.SetmealDto;
import zhuxuanyu.reggie.generator.entity.Setmeal;
import zhuxuanyu.reggie.generator.entity.SetmealDish;
import zhuxuanyu.reggie.generator.mapper.SetmealMapper;
import zhuxuanyu.reggie.generator.service.SetmealDishService;
import zhuxuanyu.reggie.generator.service.SetmealService;

import java.util.List;
import java.util.stream.Collectors;

/**
* @author zhuxuanyu
* @description 针对表【setmeal(套餐)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
@RequiredArgsConstructor
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal>
    implements SetmealService{
    private final SetmealDishService setmealDishService;


    @Override
    public void saveWithDish(SetmealDto setmealDto) {
        //保存套餐信息
        this.save(setmealDto);

        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
        setmealDishes = setmealDishes.stream().map(item->{
            item.setSetmealId(setmealDto.getId());
            return item;
        }).collect(Collectors.toList());
        //保存关联信息
        setmealDishService.saveBatch(setmealDishes);
    }


    /**
     * 根据传入的id删除，可能是多个id
     * @param list
     */
    @Override
    public void removeWithDish(List<Long> list) {
        //只有停售的才能删除
        LambdaQueryWrapper<Setmeal> wrapper = new LambdaQueryWrapper<>();
        wrapper.in(Setmeal::getId,list);
        wrapper.eq(Setmeal::getStatus,1);

        long count = this.count(wrapper);
        if (count>0){
            //如果不能删除就抛出业务异常
            throw new CustomException("套餐正在售卖中，无法删除！");
        }

        //可以删除就先删除setmeal
        this.removeByIds(list);

        //删除菜品与套餐关联
        LambdaQueryWrapper<SetmealDish> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(SetmealDish::getSetmealId,list);
        setmealDishService.remove(queryWrapper);
    }

    /**
     * 根据id获取到菜品信息和口味
     *
     * @param id
     * @return
     */
    @Override
    public SetmealDto getByIdWithDish(Long id) {
        //查询菜品基本信息
        Setmeal setmeal = this.getById(id);
        SetmealDto setmealDto = new SetmealDto();
        BeanUtils.copyProperties(setmeal, setmealDto);
        //查询菜品关系
        LambdaQueryWrapper<SetmealDish> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(SetmealDish::getSetmealId, setmeal.getId());
        List<SetmealDish> list = setmealDishService.list(wrapper);
        setmealDto.setSetmealDishes(list);

        return setmealDto;
    }
}




