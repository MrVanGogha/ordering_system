package com.xmu.controller;

import com.xmu.entity.Reservation;
import com.xmu.service.ReservationService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 预约管理
 * @Date: Create in 22:04 2022/3/28
 */
@RestController
@RequestMapping("reservation")
public class ReservationController{

    @Autowired
    private ReservationService service;

    /**
     * 添加预约
     * @param reservation
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody Reservation reservation){
        if(service.exist(reservation)){
            return RestResponse.error(500,"上次预约未消费,请不要重复预约");
        }
        service.save(reservation);
        return RestResponse.success();
    }

    /**
     * 修改预约
     * @param reservation
     * @return
     */
    @RequestMapping("update")
    public RestResponse update(@RequestBody Reservation reservation){

        service.update(reservation);
        return RestResponse.success();
    }

    /**
     * 删除预约
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public RestResponse delete(@RequestParam("id") Integer id){

        service.delete(id);
        return RestResponse.success();
    }

    /**
     * 根据预约人姓名和昵称模糊查询预约
     * @param name
     * @return
     */
    @RequestMapping("queryAllLikeName")
    public RestResponse<List<Reservation>> queryAllLikeName(@RequestParam(value = "name",required = false) String name){
        List<Reservation> list = service.queryAllLikeName(name);
        return RestResponse.success(list);
    }


    /**
     * 根据id查询预约
     * @param id
     * @return
     */
    @RequestMapping("queryById")
    public RestResponse<Reservation> queryById(@RequestParam("id") Integer id){
        Reservation reservation = service.queryById(id);
        return RestResponse.success(reservation);
    }

    /**
     * 根据手机号查询预约信息
     * @param phone
     * @return
     */
    @RequestMapping("queryAllByPhone")
    public RestResponse<List<Reservation>> queryAllByPhone(@RequestParam("phone") String phone){

        List<Reservation> list = service.queryAllByPhone(phone);
        return RestResponse.success(list);
    }
}
