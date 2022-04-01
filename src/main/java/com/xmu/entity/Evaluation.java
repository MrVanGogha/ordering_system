package com.xmu.entity;

import java.util.Date;

/**
 * @Description: 评价管理
 * @Date: Create in 23:54 2022/3/27
 */
public class Evaluation {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 登录昵称
     */
    private String loginName;
    /**
     * 登录手机号码
     */
    private String loginPhone;

    /**
     * 联系人
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getCreateTime() {
        return createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
