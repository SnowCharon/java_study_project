package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.generator.entity.Category;
import zhuxuanyu.reggie.generator.service.CategoryService;

import java.util.List;

/**
 * @title: CategoryController
 * @Author 竹玄羽
 * @Date: 2023/2/17 13:59
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    /**
     * 分页
     *
     * @param page     页码
     * @param pageSize 页大小
     * @return 返回分页
     */
    @GetMapping("/page")
    public Result<Page<Category>> page(int page, int pageSize) {
        log.info("page:{},pageSize:{}", page, pageSize);

        //构造分页构造器
        Page<Category> pageInfo = new Page<>(page, pageSize);
        //构造条件构造器
        LambdaQueryWrapper<Category> wrapper = new LambdaQueryWrapper<>();
        //添加过滤条件
        wrapper.orderByDesc(Category::getSort);
        //执行查询
        categoryService.page(pageInfo, wrapper);

        return Result.success(pageInfo);
    }

    /**
     * 新增套餐和菜系分类
     *
     * @param category 对象
     * @return 返回是否成功
     */
    @PostMapping
    public Result<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return Result.success("新增分类成功！");
    }

    /**
     * 删除category
     *
     * @param id category的Id
     * @return 返回操作状态码
     */
    @DeleteMapping
    public Result<String> delete(Long id) {
        log.info("Id:{}", id);
        categoryService.remove(id);
        return Result.success("删除成功！");
    }

    @PutMapping
    public Result<String> update(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.updateById(category);
        return Result.success("修改成功！");
    }

    /**
     * 根据条件查询分类数据
     * @param category
     * @return
     */
    @GetMapping("/list")
    public Result<List<Category>>  list(Category category){
        LambdaQueryWrapper<Category> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(category.getType()!=null,Category::getType,category.getType()).orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);
        List<Category> list = categoryService.list(wrapper);
        return Result.success(list);
    }
}
