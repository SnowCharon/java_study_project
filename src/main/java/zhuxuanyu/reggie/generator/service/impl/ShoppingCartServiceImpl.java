package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.common.CustomException;
import zhuxuanyu.reggie.generator.entity.ShoppingCart;
import zhuxuanyu.reggie.generator.service.ShoppingCartService;
import zhuxuanyu.reggie.generator.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zhuxuanyu
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:51
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

    @Override
    public List<ShoppingCart> getShoppingCartList(Long userId) {
        LambdaQueryWrapper<ShoppingCart> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(ShoppingCart::getUserId, userId);
        return this.list(wrapper);
    }
}




