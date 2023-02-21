package zhuxuanyu.reggie.generator.service;

import zhuxuanyu.reggie.generator.entity.Orders;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zhuxuanyu
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2023-02-16 10:16:50
*/
public interface OrdersService extends IService<Orders> {

    /**
     * 下单事务
     * @param orders
     */
    void submit(Orders orders);
}
