package com.xmu.entity;

/**
 * @Description: 菜品实体
 * @Date: Create in 23:43 2022/3/27
 */
public class Dishes {

    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 菜品名称
     */
    private String name;

    /**
     * 菜品价格
     */
    private Double price;

    /**
     * 菜品状态 0表示下架 1表示上架
     */
    private Integer status;

    private DishesCategory dishesCategory;



    public Dishes(Integer id, String name, Double price, Integer status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public Dishes() {
    }

    public DishesCategory getDishesCategory() {
        return dishesCategory;
    }

    public void setDishesCategory(DishesCategory dishesCategory) {
        this.dishesCategory = dishesCategory;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
