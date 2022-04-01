package com.xmu.controller;

import com.xmu.entity.Box;
import com.xmu.service.BoxService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 包厢管理
 * @Date: Create in 22:20 2022/3/28
 */
@RestController
@RequestMapping("box")
public class BoxController {

    @Autowired
    private BoxService service;

    /**
     * 添加包厢
     * @param box
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody Box box) {
        //校验编码是否已经存在
        Boolean exist = service.exist(box);
        if(exist){
            return RestResponse.error(500,"包厢号码已经存在");
        }
        service.save(box);
        return RestResponse.success();
    }


    /**
     * 修改包厢
     * @param box
     * @return
     */
    @RequestMapping("update")
    public RestResponse update(@RequestBody Box box) {
        Boolean exist = service.exist(box);
        if(exist){
            return RestResponse.error(500,"包厢号码已经存在");
        }
        service.update(box);
        return RestResponse.success();
    }

    /**
     * 删除包厢
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public RestResponse delete(@RequestParam(value = "id") Integer id) {
        service.delete(id);
        return RestResponse.success();
    }

    /**
     * 根据编码模糊查询包厢 当不填写包厢编码时 默认查询全部
     * @param boxCode
     * @return
     */
    @RequestMapping("queryAllLikeCode")
    public RestResponse queryAllLikeCode(@RequestParam(value = "boxCode",required = false) String boxCode) {
        List<Box> boxes = service.queryAllLikeCode(boxCode);
        return RestResponse.success(boxes);
    }

    @RequestMapping("queryById")
    public RestResponse queryById(@RequestParam(value = "id") Integer id){
        Box box = service.queryById(id);
        return RestResponse.success(box);
    }

}
