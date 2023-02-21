package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.generator.entity.DishFlavor;
import zhuxuanyu.reggie.generator.service.DishFlavorService;
import zhuxuanyu.reggie.generator.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




