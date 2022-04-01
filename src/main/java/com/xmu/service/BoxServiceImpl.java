package com.xmu.service;

import com.xmu.entity.Box;
import com.xmu.mapper.BoxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: ove
 * @Email: Mr_VanGogh@yeah.net
 * @Date: Create in 22:06 2022/3/28
 */
@Service
public class BoxServiceImpl implements BoxService{
    @Autowired
    private BoxMapper mapper;

    /**
     * 添加包厢
     * @param box
     * @return
     */
    @Override
    public Integer save(Box box) {
        box.setCreateTime(new Date());
        return mapper.save(box);
    }

    /**
     * 修改包厢
     * @param box
     * @return
     */
    @Override
    public Integer update(Box box) {
        return mapper.update(box);
    }

    /**
     * 删除包厢
     * @param id
     * @return
     */
    @Override
    public Integer delete(Integer id) {
        return mapper.delete(id);
    }

    /**
     * 通过编码查询包厢
     * @param box
     * @return
     */
    @Override
    public Boolean exist(Box box) {
        Box res = mapper.queryByCode(box.getBoxCode(), box.getId());
        return res != null;
    }

    /**
     * 根据编码模糊查询包厢
     * @param boxCode
     * @return
     */
    @Override
    public List<Box> queryAllLikeCode(String boxCode) {
        return mapper.queryAllLikeCode(boxCode);
    }

    /**
     * 根据id查询包厢
     * @param id
     * @return
     */
    @Override
    public Box queryById(Integer id) {
        return mapper.queryById(id);
    }

    /**
     * 更新包厢状态
     * @param boxCode
     * @param status
     * @return
     */
    @Override
    public Integer updateStatus(String boxCode, Integer status) {
        return mapper.updateStatus(boxCode,status);
    }


}
