package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.generator.entity.Employee;
import zhuxuanyu.reggie.generator.service.EmployeeService;
import zhuxuanyu.reggie.generator.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService {

}




