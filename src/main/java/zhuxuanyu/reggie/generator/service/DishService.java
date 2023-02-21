package zhuxuanyu.reggie.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;
import zhuxuanyu.reggie.dto.DishDto;
import zhuxuanyu.reggie.generator.entity.Dish;

import java.util.List;

/**
* @author zhuxuanyu
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2023-02-16 10:16:50
*/
public interface DishService extends IService<Dish> {
    /**
     * 新增菜品，同时新增口味
     * @param dishDto
     */
    @Transactional
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id获取到菜品信息和口味
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品信息，和口味信息
     * @param dishDto
     */
    @Transactional
    void updateWithFlavor(DishDto dishDto);

    /**
     * 删除菜品和口味
     * @param list
     */
    @Transactional
    void removeWithFlavor(List<Long> list);
}
