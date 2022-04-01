package com.xmu.mapper;

import com.xmu.entity.Box;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 包厢管理
 * @Date: Create in 22:04 2022/3/28
 */
public interface BoxMapper {

    /**
     * 添加包厢
     * @param box
     * @return
     */
    Integer save(Box box);

    /**
     * 修改包厢
     * @param box
     * @return
     */
    Integer update(Box box);

    /**
     * 删除包厢
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据编码模糊查询包厢
     * @param boxCode
     * @return
     */
    List<Box> queryAllLikeCode(String boxCode);

    /**
     * 通过编码和Id校验包厢是否已经存在
     * @param boxCode
     * @return
     */
    Box queryByCode(@Param("boxCode") String boxCode,@Param("id")Integer id);

    /**
     * 根据id查询包厢
     * @param id
     * @return
     */
    Box queryById(Integer id);

    /**
     * 更新包厢状态
     * @param boxCode
     * @param status
     * @return
     */
    Integer updateStatus(@Param("boxCode") String boxCode, @Param("status") Integer status);
}
