package zhuxuanyu.reggie.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;
import zhuxuanyu.reggie.generator.entity.Setmeal;
import zhuxuanyu.reggie.generator.entity.SetmealDish;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
