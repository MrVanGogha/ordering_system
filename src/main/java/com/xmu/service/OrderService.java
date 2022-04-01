package com.xmu.service;

import com.xmu.entity.Order;

import java.util.List;

/**
 * @Description: 订单管理
 * @Date: Create in 22:04 2022/3/28
 */
public interface OrderService {

    /**
     * 添加订单
     * @param order
     * @return
     */
    Integer save(Order order);


    /**
     * 删除订单
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据预登录昵称或手机号模糊查询订单
     * @param name
     * @return
     */
    List<Order> queryAllLikeName(String name);


    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    Order queryById(Integer id);

    /**
     * 根据微信手机号查询订单信息
     * @param phone
     * @return
     */
    List<Order> queryAllByPhone(String phone);
}
