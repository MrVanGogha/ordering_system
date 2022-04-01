package com.xmu.mapper;

import com.xmu.entity.Evaluation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 评价管理
 * @Date: Create in 23:56 2022/3/27
 */
public interface EvaluationMapper {

    /**
     * 添加评价
     * @param evaluation
     * @return
     */
    Integer save(Evaluation evaluation);

    /**
     * 根据微信昵称或联系人名称模糊查询查询评价
     * @return
     */
    List<Evaluation> queryAllLikeName(@Param("name") String name);




}
