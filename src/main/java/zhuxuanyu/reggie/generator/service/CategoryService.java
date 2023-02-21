package zhuxuanyu.reggie.generator.service;

import zhuxuanyu.reggie.common.CustomException;
import zhuxuanyu.reggie.generator.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zhuxuanyu
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service
* @createDate 2023-02-16 10:16:50
*/
public interface CategoryService extends IService<Category> {
  public void remove(Long id) throws CustomException;

  /**
   * 根据条件查询分类列表
   * @param category
   */
}
