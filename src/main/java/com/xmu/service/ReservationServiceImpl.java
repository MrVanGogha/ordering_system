package com.xmu.service;

import com.xmu.entity.Reservation;
import com.xmu.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description: 预约管理
 * @Date: Create in 22:04 2022/3/28
 */
@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationMapper mapper;

    @Autowired
    private BoxService boxService;

    /**
     * 添加预约
     * @param reservation
     * @return
     */
    public Integer save(Reservation reservation){
        //状态为为支付
        reservation.setStatus(0);
        reservation.setCreateTime(new Date());
        //更新包厢状态 已经被预约
        boxService.updateStatus(reservation.getBox().getBoxCode(),1);
        return mapper.save(reservation);
    }

    /**
     * 修改预约
     * @param reservation
     * @return
     */
    public Integer update(Reservation reservation){
        return mapper.update(reservation);
    }

    /**
     * 删除预约
     * @param id
     * @return
     */
    public Integer delete(Integer id){
        //更新包厢状态 已经解约
        Reservation reservation = queryById(id);
        boxService.updateStatus(reservation.getBox().getBoxCode(),0);
        return mapper.delete(id);
    }

    /**
     * 根据预约人姓名和昵称模糊查询预约
     * @param name
     * @return
     */
    public List<Reservation> queryAllLikeName(String name){
        return mapper.queryAllLikeName(name);
    }


    /**
     * 根据id查询预约
     * @param id
     * @return
     */
    public Reservation queryById(Integer id){
        return mapper.queryById(id);
    }

    /**
     * 根据手机号查询预约信息
     * @param phone
     * @return
     */
    public List<Reservation> queryAllByPhone(String phone){
        return mapper.queryAllByPhone(phone);
    }

    @Override
    public Boolean exist(Reservation reservation) {
        String phone = reservation.getLoginPhone();
        Reservation res = mapper.exist(phone);
        return res != null;
    }

    @Override
    public void updateStatus(Integer id, Integer status) {
        mapper.updateStatus(id,status);
    }

    @Override
    public Reservation queryLast(String phone) {
        return mapper.queryLast(phone);
    }
}
