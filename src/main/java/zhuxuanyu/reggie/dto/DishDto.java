package zhuxuanyu.reggie.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import zhuxuanyu.reggie.generator.entity.Dish;
import zhuxuanyu.reggie.generator.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuxuanyu
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
