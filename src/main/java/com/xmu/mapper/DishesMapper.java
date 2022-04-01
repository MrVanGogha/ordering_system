package com.xmu.mapper;

import com.xmu.entity.Dishes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 菜品管理
 * @Date: Create in 22:04 2022/3/28
 */
public interface DishesMapper {

    /**
     * 添加菜品
     * @param dishes
     * @return
     */
    Integer save(Dishes dishes);

    /**
     * 修改菜品
     * @param dishes
     * @return
     */
    Integer update(Dishes dishes);

    /**
     * 删除菜品
     * @param id
     * @return
     */
    Integer delete(Integer id);


    /**
     * 根据编码模糊查询菜品
     * @param name
     * @return
     */
    List<Dishes> queryAllLikeName(String name);


    /**
     * 根据id查询菜品
     * @param id
     * @return
     */
    Dishes queryById(Integer id);

    /**
     * 更新菜品状态
     * @param id
     * @param status
     * @return
     */
    Integer updateStatus(@Param("id") Integer id, @Param("status") Integer status);

    /**
     * 校验菜品名唯一
     * @param id
     * @param name
     * @return
     */
    Dishes exist(@Param("id")Integer id, @Param("name") String name);
}
