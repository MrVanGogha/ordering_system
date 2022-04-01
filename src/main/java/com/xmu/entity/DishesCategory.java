package com.xmu.entity;

import java.util.Date;

/**
 * @Description: 菜品分类实体
 * @Date: Create in 23:40 2022/3/27
 */
public class DishesCategory {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 菜品分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    public DishesCategory() {
    }

    public DishesCategory(Integer id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
