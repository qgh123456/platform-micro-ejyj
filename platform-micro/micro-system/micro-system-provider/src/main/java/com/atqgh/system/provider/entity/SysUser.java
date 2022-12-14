package com.atqgh.system.provider.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 用户信息表.
 *
 * @author Mubai
 * @date 2022-08-14 10:45:24
 */
@Data
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID.
     */
    @TableId
    private Long id;

    /**
     * 用户编码.
     */
    private String code;

    /**
     * 部门编码.
     */
    private String deptCode;

    /**
     * 用户账号.
     */
    private String userName;

    /**
     * 用户昵称.
     */
    private String nickName;

    /**
     * 用户类型（00系统用户）.
     */
    private String userType;

    /**
     * 用户邮箱.
     */
    private String email;

    /**
     * 手机号码.
     */
    private String phonenumber;

    /**
     * 用户性别（0男 1女 2未知）.
     */
    private String sex;

    /**
     * 头像地址.
     */
    private String avatar;

    /**
     * 密码.
     */
    private String password;

    /**
     * 帐号状态（0正常 1停用）.
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）.
     */
    private String delFlag;

    /**
     * 最后登录IP.
     */
    private String loginIp;

    /**
     * 最后登录时间.
     */
    private Date loginDate;

    /**
     * 创建者.
     */
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间.
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新者.
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    /**
     * 更新时间.
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 备注.
     */
    private String remark;

}
