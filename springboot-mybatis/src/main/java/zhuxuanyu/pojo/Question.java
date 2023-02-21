package zhuxuanyu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 问题
 * @TableName t_question
 */
@TableName(value ="t_question")
@Data
public class Question implements Serializable {
    /**
     * 问题id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 问题
     */
    private String body;

    /**
     * A选项
     */
    private String a;

    /**
     * B选项
     */
    private String b;

    /**
     * C选项
     */
    private String c;

    /**
     * D选项
     */
    private String d;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 答案
     */
    private String answer;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}