package com.xmu.service;

import com.xmu.entity.Evaluation;

import java.util.List;

/**
 * @Description:
 * @Author: ove
 * @Email: Mr_VanGogh@yeah.net
 * @Date: Create in 0:00 2022/3/28
 */
public interface EvaluationService {
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
    List<Evaluation> queryAllLikeName(String name);

}
