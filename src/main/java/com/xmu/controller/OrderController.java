package com.xmu.controller;

import com.xmu.entity.Order;
import com.xmu.entity.Reservation;
import com.xmu.service.OrderService;
import com.xmu.service.ReservationService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 订单管理
 * @Date: Create in 22:04 2022/3/28
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService service;

    @Autowired
    private ReservationService reservationService;

    /**
     * 添加订单
     * @param order
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody Order order){
        //更新对应的预约信息状态
        String loginPhone = order.getLoginPhone();
        Reservation reservation = reservationService.queryLast(loginPhone);
        if(reservation != null){
            reservationService.updateStatus(reservation.getId(),1);
        }
        service.save(order);
        return RestResponse.success();
    }


    /**
     * 删除订单
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public RestResponse delete(Integer id){
        service.delete(id);
        return RestResponse.success();
    }

    /**
     * 根据预登录昵称或手机号模糊查询订单
     * @param name
     * @return
     */
    @RequestMapping("queryAllLikeName")
    public RestResponse<List<Order>> queryAllLikeName(@RequestParam(required = false) String name){
        List<Order> orders = service.queryAllLikeName(name);
        return RestResponse.success(orders);
    }


    /**
     * 根据id查询订单
     * @param id
     * @return
     */
    @RequestMapping("queryById")
    public RestResponse<Order> queryById(Integer id){

        Order order = service.queryById(id);
        return RestResponse.success(order);
    }

    /**
     * 根据微信手机号查询订单信息
     * @param phone
     * @return
     */
    @RequestMapping("queryAllByPhone")
    public RestResponse<List<Order>> queryAllByPhone(String phone){

        List<Order> orders = service.queryAllByPhone(phone);
        return RestResponse.success(orders);
    }
}
