package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.generator.entity.AddressBook;
import zhuxuanyu.reggie.generator.service.AddressBookService;
import zhuxuanyu.reggie.generator.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:50
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




