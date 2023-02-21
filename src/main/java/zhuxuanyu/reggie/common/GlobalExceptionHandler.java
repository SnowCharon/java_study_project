package zhuxuanyu.reggie.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @title: GlobalExceptionHandler
 * @Author 竹玄羽
 * @Date: 2023/2/16 18:41
 * 全局异常处理
 */
@Slf4j
@ResponseBody
@ControllerAdvice(annotations = {RestController.class, Controller.class})
public class GlobalExceptionHandler{
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public Result<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());
        if (ex.getMessage().contains("Duplicate entry")){
            String[] strings = ex.getMessage().split(" ");
            String msg = "账号" + strings[2] + "已经存在!";
            return Result.error(msg);
        }

        return Result.error("未知错误！");
    }

    @ExceptionHandler(CustomException.class)
    public Result<String> exceptionHandler(CustomException ex){
        log.error(ex.getMessage());
        return Result.error(ex.getMessage());
    }
}
