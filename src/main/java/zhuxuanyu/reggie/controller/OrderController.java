package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.BaseContext;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.generator.entity.Orders;
import zhuxuanyu.reggie.generator.service.OrdersService;

/**
 * @title: OrderController
 * @Author 竹玄羽
 * @Date: 2023/2/21 15:44
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrdersService ordersService;

    /**
     * 用户下单
     * @param orders
     * @return
     */
    @PostMapping("/submit")
    public Result<String> submit(@RequestBody Orders orders){
        log.info("下单：{}",orders);
        ordersService.submit(orders);
        return Result.success("下单成功！");
    }

    @GetMapping("/userPage")
    public Result<Page<Orders>> page(Integer page,Integer pageSize){
        LambdaQueryWrapper<Orders> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Orders::getUserId,BaseContext.getCurrentId());
        Page<Orders> pageInfo = new Page<>(page,pageSize);
        ordersService.page(pageInfo,wrapper);
        return Result.success(pageInfo);
    }
}
