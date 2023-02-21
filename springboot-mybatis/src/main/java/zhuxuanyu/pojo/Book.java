package zhuxuanyu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_book
 */
@TableName(value ="t_book")
@Data
public class Book implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String bookimg;

    /**
     * 
     */
    private String bookname;

    /**
     * 
     */
    private Double price;

    /**
     * 
     */
    private String author;

    /**
     * 
     */
    private Integer salecount;

    /**
     * 
     */
    private Integer bookcount;

    /**
     * 
     */
    private Integer bookstatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}