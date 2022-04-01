package com.xmu.service;

import com.xmu.entity.Evaluation;
import com.xmu.mapper.EvaluationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: ove
 * @Email: Mr_VanGogh@yeah.net
 * @Date: Create in 0:00 2022/3/28
 */
@Service
public class EvaluationServiceImpl implements EvaluationService{

    @Autowired
    private EvaluationMapper mapper;
    /**
     * 添加评价
     * @param evaluation
     * @return
     */
    @Override
    public Integer save(Evaluation evaluation) {
        evaluation.setCreateTime(new Date());
        return mapper.save(evaluation);
    }


    /**
     * 根据微信昵称或联系人名称模糊查询查询评价
     * @return
     */
    @Override
    public List<Evaluation> queryAllLikeName(String name) {
        return mapper.queryAllLikeName(name);
    }
}
