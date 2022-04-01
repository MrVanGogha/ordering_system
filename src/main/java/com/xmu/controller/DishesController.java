package com.xmu.controller;

import com.xmu.entity.Dishes;
import com.xmu.service.DishesService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 菜品管理
 * @Date: Create in 22:04 2022/3/28
 */
@RestController
@RequestMapping("dishes")
public class DishesController{

    @Autowired
    private DishesService dishesService;

    /**
     * 添加菜品
     * @param dishes
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody Dishes dishes){
        if(dishesService.exist(dishes)){
            return RestResponse.error(500,"菜品名称已经存在");
        }
        dishesService.save(dishes);
        return RestResponse.success();
    }

    /**
     * 修改菜品
     * @param dishes
     * @return
     */
    @RequestMapping("update")
    public RestResponse update(@RequestBody Dishes dishes){
        if(dishesService.exist(dishes)){
            return RestResponse.error(500,"菜品名称已经存在");
        }
        dishesService.update(dishes);
        return RestResponse.success();
    }

    /**
     * 删除菜品
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public RestResponse delete(Integer id){

        dishesService.delete(id);
        return RestResponse.success();
    }

    /**
     * 根据编码模糊查询菜品
     * @param name
     * @return
     */
    @RequestMapping("queryAllLikeName")
    public RestResponse<List<Dishes>> queryAllLikeName(@RequestParam(required = false) String name){
        List<Dishes> dishes = dishesService.queryAllLikeName(name);
        return RestResponse.success(dishes);
    }


    /**
     * 根据id查询菜品
     * @param id
     * @return
     */
    @RequestMapping("queryById")
    public RestResponse<Dishes> queryById(Integer id){
        Dishes dishes = dishesService.queryById(id);
        return RestResponse.success(dishes);
    }

    /**
     * 更新菜品状态  0表示下架 1表示上架
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("updateStatus")
    public RestResponse updateStatus(Integer id, Integer status){
        dishesService.updateStatus(id,status);
        return RestResponse.success();
    }
}
