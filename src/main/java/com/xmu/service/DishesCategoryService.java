package com.xmu.service;

import com.xmu.entity.DishesCategory;

import java.util.List;

/**
 * @Description: 菜品分类
 * @Date: Create in 22:54 2022/3/28
 */
public interface DishesCategoryService {

    /**
     * 新增菜品分类
     * @param dishesCategory
     * @return
     */
    Integer save(DishesCategory dishesCategory);

    /**
     * 更新菜品分类
     * @param dishesCategory
     * @return
     */
    Integer update(DishesCategory dishesCategory);

    /**
     * 删除菜品分类
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 查询菜品
     * @param name
     * @return
     */
    List<DishesCategory> queryAll(String name);

    /**
     * 根据id查询菜品分类
     * @param id
     * @return
     */
    DishesCategory queryById(Integer id);


    /*
     * 名称唯一校验
     * */
    Boolean exist(DishesCategory dishesCategory);
}
