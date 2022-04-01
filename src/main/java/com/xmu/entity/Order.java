package com.xmu.entity;

import java.util.Date;

/**
 * @Description: 订单管理
 * @Date: Create in 23:52 2022/3/27
 */
public class Order {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 登录昵称
     */
    private String loginName;

    /**
     * 登录手机号
     */
    private String loginPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }
}
