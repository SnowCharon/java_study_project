package zhuxuanyu.reggie.generator.service;

import zhuxuanyu.reggie.generator.entity.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zhuxuanyu
* @description 针对表【shopping_cart(购物车)】的数据库操作Service
* @createDate 2023-02-16 10:16:51
*/
public interface ShoppingCartService extends IService<ShoppingCart> {
        List<ShoppingCart> getShoppingCartList(Long userId);
}
