package com.xmu.entity;

import java.util.Date;

/**
 * @Description: 预约管理
 * @Date: Create in 23:47 2022/3/27
 */
public class Reservation {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 登录昵称
     */
    private String loginName;
    /**
     * 登录手机号
     */
    private String loginPhone;

    /**
     * 就餐人数
     */
    private Integer peopleNums;

    /**
     * 预约人
     */
    private String reservationName;

    /**
     * 包厢信息
     */
    private Box box;

    /**
     * 备注
     */
    private String remark;

    /**
     * 预约状态 0表示未支付 1表示已支付
     */
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return
     */
    private Date createTime;

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

    public Integer getPeopleNums() {
        return peopleNums;
    }

    public void setPeopleNums(Integer peopleNums) {
        this.peopleNums = peopleNums;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
