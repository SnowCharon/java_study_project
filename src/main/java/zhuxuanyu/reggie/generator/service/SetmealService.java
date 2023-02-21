package zhuxuanyu.reggie.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;
import zhuxuanyu.reggie.dto.SetmealDto;
import zhuxuanyu.reggie.generator.entity.Setmeal;

import java.util.List;

/**
* @author zhuxuanyu
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2023-02-16 10:16:50
*/
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐同时保存菜品和套餐关联记录
     * @param setmealDto
     */
    @Transactional
    void saveWithDish(SetmealDto setmealDto);

    /**
     * 根据传入的id删除，可能是多个id
     * @param list
     */
    @Transactional
    void removeWithDish(List<Long> list);

    /**
     * 根据id获取到菜品信息和口味
     *
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);
}
