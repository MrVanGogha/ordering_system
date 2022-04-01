package com.xmu.service;

import com.xmu.entity.Dishes;
import com.xmu.mapper.DishesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 菜品管理
 * @Date: Create in 22:04 2022/3/28
 */
@Service
public class DishesServiceImpl implements DishesService{

    @Autowired
    private DishesMapper mapper;

    /**
     * 添加菜品
     * @param dishes
     * @return
     */
    @Override
    public Integer save(Dishes dishes){
       return mapper.save(dishes);
    }

    /**
     * 修改菜品
     * @param dishes
     * @return
     */
    @Override
    public Integer update(Dishes dishes){
      return   mapper.update(dishes);

    }

    /**
     * 删除菜品
     * @param id
     * @return
     */
    @Override
    public Integer delete(Integer id){
        return mapper.delete(id);
    }

    /**
     * 根据编码模糊查询菜品
     * @param name
     * @return
     */
    @Override
    public List<Dishes> queryAllLikeName(String name){
        return mapper.queryAllLikeName(name);
    }


    /**
     * 根据id查询菜品
     * @param id
     * @return
     */
    @Override
    public Dishes queryById(Integer id){
        return mapper.queryById(id);
    }

    /**
     * 更新菜品状态  0表示下架 1表示上架
     * @param id
     * @param status
     * @return
     */
    public Integer updateStatus(Integer id, Integer status){
        return mapper.updateStatus(id,status);
    }

    @Override
    public Boolean exist(Dishes dishes) {
        Integer id = dishes.getId();
        String name = dishes.getName();
        Dishes d = mapper.exist(id, name);
        return d != null;
    }
}
