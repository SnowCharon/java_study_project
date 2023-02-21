package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.BaseContext;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.generator.entity.ShoppingCart;
import zhuxuanyu.reggie.generator.service.ShoppingCartService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @title: ShoppingController
 * @Author 竹玄羽
 * @Date: 2023/2/21 13:27
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/shoppingCart")
public class ShoppingController {
    private final ShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     * @param shoppingCart
     * @return
     */
    @PostMapping("/add")
    public Result<ShoppingCart> add(@RequestBody ShoppingCart shoppingCart){
        log.info("购物车数据：{}",shoppingCart);

        //设置用户id
        Long currentId = BaseContext.getCurrentId();
        shoppingCart.setUserId(currentId);
        //查询当前用户购物车是否有该菜品或者套餐
        Long dishId = shoppingCart.getDishId();
        LambdaQueryWrapper<ShoppingCart> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ShoppingCart::getUserId,currentId);

        if (dishId!=null){
            //添加到购物车的是菜品
            wrapper.eq(ShoppingCart::getDishId,dishId);
        }else {
            //添加到购物车的是套餐
            wrapper.eq(ShoppingCart::getSetmealId,shoppingCart.getSetmealId());
        }

        ShoppingCart one = shoppingCartService.getOne(wrapper);
        if (one != null){
            //如果存在在给数字加一
            Integer number = one.getNumber();
            one.setNumber(number + 1);
            shoppingCartService.updateById(one);
        }else {
            //不存在创建新的纪录
            shoppingCart.setNumber(1);
            shoppingCart.setCreateTime(LocalDateTime.now());
            shoppingCartService.save(shoppingCart);
            one = shoppingCart;
        }
        return Result.success(one);
    }

    @GetMapping("/list")
    public Result<List<ShoppingCart>> list(){
        return Result.success(shoppingCartService.getShoppingCartList(BaseContext.getCurrentId()));
    }

    @PostMapping("/sub")
    public Result<List<ShoppingCart>> sub(@RequestBody ShoppingCart shoppingCart){
        if (shoppingCart.getDishId()!=null){
            ShoppingCart byId = shoppingCartService.getById(shoppingCart.getDishId());
            Integer number = byId.getNumber();
            Integer result = number -1 ;
            if (result == 0){
                shoppingCartService.removeById(shoppingCart.getDishId());
            }else {
                byId.setNumber(result);
                shoppingCartService.updateById(byId);
            }
        }else {
            ShoppingCart byId = shoppingCartService.getById(shoppingCart.getSetmealId());
            Integer number = byId.getNumber();
            Integer result = number -1 ;
            if (result == 0){
                shoppingCartService.removeById(shoppingCart.getDishId());
            }else {
                byId.setNumber(result);
                shoppingCartService.updateById(byId);
            }
        }
        return null;
    }


    @DeleteMapping("/clean")
    public Result<String> clear(){
        LambdaQueryWrapper<ShoppingCart> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ShoppingCart::getUserId,BaseContext.getCurrentId());
        shoppingCartService.remove(wrapper);
        return Result.success("购物车清空！");
    }
}
