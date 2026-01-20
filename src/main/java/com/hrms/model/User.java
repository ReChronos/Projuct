package com.hrms.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@TableName(value = "user")
@Data

public class User implements Serializable{

    @TableId(type = IdType.AUTO)
    private Long userid;//UserID

    private String userAccount;//Account

    private String userPassword;//Pwd

    private String username;//Name

    private int gender;//Gender

    private int age;//Age

    private String email;//Phone

    private String phone;//Phone

    private int department_id;//Department

    private String Job;//Job

    private Long salary;//Salary

    private Date createTime;//create_time

    private Date modifyTime;//modify_time

    /**
     * 状态 0 - 正常
     */
    private Integer userStatus;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 用户角色: 0-普通用户 1-部门负责人 2-管理员
     */
    private Integer userRole;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
