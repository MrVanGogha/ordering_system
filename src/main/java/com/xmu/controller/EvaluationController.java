package com.xmu.controller;

import com.xmu.entity.Evaluation;
import com.xmu.service.EvaluationService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 评价管理
 * @Date: Create in 0:01 2022/3/28
 */
@RestController
@RequestMapping("evaluation")
public class EvaluationController {

    @Autowired
    private EvaluationService service;

    /**
     * 保存评价
     * @param evaluation
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody Evaluation evaluation){
        service.save(evaluation);
        return RestResponse.success();
    }

    /**
     * 根据微信昵称或联系人名称模糊查询查询评价
     * @param name 联系人名称
     * @return
     */
    @RequestMapping("queryAllLikeName")
    public RestResponse queryAllLikeName(@RequestParam(value = "name",required = false) String name){
        List<Evaluation> evaluations = service.queryAllLikeName(name);
        return RestResponse.success(evaluations);
    }
}
