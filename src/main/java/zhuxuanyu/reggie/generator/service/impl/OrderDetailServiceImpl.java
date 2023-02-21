package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.generator.entity.OrderDetail;
import zhuxuanyu.reggie.generator.service.OrderDetailService;
import zhuxuanyu.reggie.generator.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService {

}




