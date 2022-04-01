package com.xmu.service;

import com.xmu.entity.DishesCategory;
import com.xmu.mapper.DishesCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: ove
 * @Email: Mr_VanGogh@yeah.net
 * @Date: Create in 22:57 2022/3/28
 */
@Service
public class DishesCategoryServiceImpl implements DishesCategoryService{

    @Autowired
    private DishesCategoryMapper mapper;

    /**
     * 新增菜品分类
     * @param dishesCategory
     * @return
     */
    @Override
    public Integer save(DishesCategory dishesCategory) {
        dishesCategory.setCreateTime(new Date());
        return mapper.save(dishesCategory);
    }

    /**
     * 更新菜品分类
     * @param dishesCategory
     * @return
     */
    @Override
    public Integer update(DishesCategory dishesCategory) {
        return mapper.update(dishesCategory);
    }

    /**
     * 删除菜品分类
     * @param id
     * @return
     */
    @Override
    public Integer delete(Integer id) {
        return mapper.delete(id);
    }

    /**
     * 查询菜品
     * @param name
     * @return
     */
    @Override
    public List<DishesCategory> queryAll(String name) {
        return mapper.queryAll(name);
    }

    /**
     * 根据id查询菜品分类
     * @param id
     * @return
     */
    @Override
    public DishesCategory queryById(Integer id) {
        return mapper.queryById(id);
    }

    /**
     * 唯一校验
     * @param dishesCategory
     * @return
     */
    @Override
    public Boolean exist(DishesCategory dishesCategory) {
        Integer id = dishesCategory.getId();
        String name = dishesCategory.getName();
        DishesCategory d = mapper.exist(name,id);
        return d != null;
    }


}
