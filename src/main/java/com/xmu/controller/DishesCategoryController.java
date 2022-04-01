package com.xmu.controller;

import com.xmu.entity.DishesCategory;
import com.xmu.service.DishesCategoryService;
import com.xmu.utils.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 菜品分类管理
 * @Date: Create in 22:59 2022/3/28
 */
@RestController
@RequestMapping("dishescategory")
public class DishesCategoryController {

    @Autowired
    private DishesCategoryService service;

    /**
     * 新增菜品分类
     * @param dishesCategory
     * @return
     */
    @RequestMapping("save")
    public RestResponse save(@RequestBody DishesCategory dishesCategory) {
        if(service.exist(dishesCategory)){
            return RestResponse.error(500,"分类名称已经存在");
        }
        service.save(dishesCategory);
        return RestResponse.success();
    }

    /**
     * 更新菜品分类
     * @param dishesCategory
     * @return
     */
    @RequestMapping("update")
    public RestResponse update(@RequestBody DishesCategory dishesCategory) {
        if(service.exist(dishesCategory)){
            return RestResponse.error(500,"分类名称已经存在");
        }
        service.update(dishesCategory);
        return RestResponse.success();
    }

    /**
     * 删除菜品分类
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public RestResponse delete(@RequestParam(value = "id") Integer id) {
        service.delete(id);
        return RestResponse.success();
    }

    /**
     * 查询菜品
     * @param name
     * @return
     */
    @RequestMapping("queryAll")
    public RestResponse<List<DishesCategory> > queryAll(@RequestParam(value = "name",required = false) String name) {
        List<DishesCategory> list = service.queryAll(name);
        return RestResponse.success(list);
    }

    /**
     * 根据id查询菜品分类
     * @param id
     * @return
     */
    @RequestMapping("queryById")
    public RestResponse queryById(@RequestParam("id") Integer id){
        DishesCategory dishesCategory = service.queryById(id);
        return RestResponse.success(dishesCategory);
    }
}
