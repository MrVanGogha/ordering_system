package com.xmu.service;

import com.xmu.entity.Order;
import com.xmu.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: 订单管理
 * @Date: Create in 22:04 2022/3/28
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper mapper;


    /**
     * 添加订单
     * @param order
     * @return
     */
    public Integer save(Order order){
        order.setCreateTime(new Date());
        return mapper.save(order);
    }


    /**
     * 删除订单
     * @param id
     * @return
     */
    public Integer delete(Integer id){
        return mapper.delete(id);
    }

    /**
     * 根据预登录昵称或手机号模糊查询订单
     * @param name
     * @return
     */
    public List<Order> queryAllLikeName(String name){
        return mapper.queryAllLikeName(name);
    }


    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    public Order queryById(Integer id){
        return mapper.queryById(id);
    }

    /**
     * 根据微信手机号查询订单信息
     * @param phone
     * @return
     */
    public List<Order> queryAllByPhone(String phone){
        return mapper.queryAllByPhone(phone);
    }
}
