package personal.shengyu.memory.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Date;

/**
 * 日记表(Diary)实体类
 *
 * @author nekotako
 * @since 2024-04-06 20:56:50
 */

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("diary")
public class Diary implements Serializable {
    private static final long serialVersionUID = 944735122267172346L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日记类型
     */
    @TableField("category")
    private String category;

    /**
     * 日记时间
     */
    @TableField("date")
    private Date date;

    /**
     * 当天天气
     */
    @TableField("weather")
    private String weather;

    /**
     * 当天温度
     */
    @TableField("temperature")
    private Double temperature;

    /**
     * 日记标题
     */
    @TableField("title")
    private String title;

    /**
     * 日记内容
     */
    @TableField("content")
    private String content;

}

