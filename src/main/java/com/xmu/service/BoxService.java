package com.xmu.service;

import com.xmu.entity.Box;

import java.util.List;

/**
 * @Description: 包厢管理
 * @Date: Create in 22:04 2022/3/28
 */
public interface BoxService {

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
     * 通过编码和Id校验包厢是否已经存在
     * @param box
     * @return
     */
    Boolean exist(Box box);

    /**
     * 根据编码模糊查询包厢
     * @param boxCode
     * @return
     */
    List<Box> queryAllLikeCode(String boxCode);

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
    Integer updateStatus(String boxCode,Integer status);


}
