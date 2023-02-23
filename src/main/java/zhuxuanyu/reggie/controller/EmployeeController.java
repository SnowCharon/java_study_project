package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.generator.entity.Employee;
import zhuxuanyu.reggie.generator.service.EmployeeService;

import javax.servlet.http.HttpServletRequest;

/**
 * @title: EmployeeController
 * @Author 竹玄羽
 * @Date: 2023/2/16 10:28
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    /**
     * 登录
     * @param request request
     * @param employee 接收登录信息
     * @return 返回结果
     */
    @PostMapping("/login")
    public Result<Employee> login(HttpServletRequest request, @RequestBody Employee employee){
        //1、将页面提交的密码password进行md5加密处理
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        // 2、根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Employee::getUsername,employee.getUsername());
        Employee current = employeeService.getOne(wrapper);

        // 3、如果没有查询到则返回登录失败结果
        if (current==null){
            return Result.error("登陆失败,用户不存在!");
        }
        // 4、密码比对，如果不一致则返回登录失败结果
        if (!current.getPassword().equals(password)){
            return Result.error("登陆失败,密码错误!");
        }

        // 5、查看员工状态，如果为已禁用状态，则返回员工已禁用结果
        if (current.getStatus() == 0){
            return Result.error("登陆失败,该账户已被封禁!");
        }

        // 6、登录成功，将员工id存入Session并返回登录成功结果
        request.getSession().setAttribute("employee",current.getId());
        return Result.success(current);
    }

    /**
     * 员工退出
     * @param request 请求域
     * @return 返回字符串
     */
    @PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("current");
        return Result.success("退出成功！");
    }

    @PostMapping
    public Result<String> save(HttpServletRequest request,@RequestBody Employee employee){
        log.info("新增员工");
        log.info("员工信息：{}",employee);
        //设置初始密码
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));
        log.info("员工信息：{}",employee);

        employeeService.save(employee);

        return Result.success("保存成功！");
    }

    /**
     * 员工信息分页查询
     * @param page 页码
     * @param pageSize 每页大小
     * @param name 员工姓名——如果有模糊查询
     * @return 返回Page信息
     */
    @GetMapping("/page")
    public Result<Page<Employee>> page(int page,int pageSize,String name){
        log.info("page:{},pageSize:{},name:{}",page,pageSize,name);

        //构造分页构造器
        Page<Employee> pageInfo = new Page<>(page,pageSize);
        //构造条件构造器
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
        //添加过滤条件
        wrapper.like(StringUtils.isNotEmpty(name),Employee::getName,name).orderByDesc(Employee::getUpdateTime);
        //执行查询
        employeeService.page(pageInfo,wrapper);

        return Result.success(pageInfo);
    }

    /**
     * 修改员工数据
     * @param employee 员工信息
     * @return 返回状态码
     */
    @PutMapping
    public Result<String> update(HttpServletRequest request,@RequestBody Employee employee){
        log.info("用户信息：{}", employee);
        employeeService.updateById(employee);
        return Result.success("员工信息修改成功！");
    }

    /**
     * 根据id查询员工信息，返回json数据，以便在前端回显
     * @param id 员工id
     * @return 返回员工信息
     */
    @GetMapping("/{id}")
    public Result<Employee> getById(@PathVariable Long id){
        log.info("id:{}",id);

        Employee employee = employeeService.getById(id);
        if (employee != null){
            return Result.success(employee);
        }
        return Result.error("没有查询到员工信息!");
    }
}
