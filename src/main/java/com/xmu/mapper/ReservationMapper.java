package com.xmu.mapper;

import com.xmu.entity.Reservation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 预约管理
 * @Date: Create in 22:04 2022/3/28
 */
public interface ReservationMapper {

    /**
     * 添加预约
     * @param reservation
     * @return
     */
    Integer save(Reservation reservation);

    /**
     * 修改预约
     * @param reservation
     * @return
     */
    Integer update(Reservation reservation);

    /**
     * 删除预约
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据预约人姓名和昵称模糊查询预约
     * @param name
     * @return
     */
    List<Reservation> queryAllLikeName(String name);


    /**
     * 根据id查询预约
     * @param id
     * @return
     */
    Reservation queryById(Integer id);

    /**
     * 根据手机号查询预约信息
     * @param phone
     * @return
     */
    List<Reservation> queryAllByPhone(String phone);

    /**
     * 校验是否有未消费的预约
     * @param phone
     * @return
     */
    Reservation exist(String phone);

    /**
     * 更新状态
     */
    void updateStatus(@Param("id") Integer id, @Param("status") Integer status);

    /**
     * 查询最后一条建立信息
     */
    Reservation queryLast(String phone);
}
