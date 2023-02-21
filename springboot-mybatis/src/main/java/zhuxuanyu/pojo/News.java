package zhuxuanyu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 新闻
 * @TableName t_news
 */
@TableName(value ="t_news")
@Data
public class News implements Serializable {
    /**
     * 新闻id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 新闻标题
     */
    private String headlines;

    /**
     * 新闻网址
     */
    private String src;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}