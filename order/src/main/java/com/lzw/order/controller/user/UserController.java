package com.lzw.order.controller.user;

import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * http://127.0.0.1:8090/v2/r/r2
 * Authorization   Bearer 3f95a1c9-769c-400b-b202-a07b27a2e7af
 */

@RestController
@RequestMapping("/v2")
@Api(value = "RestFul测试接口-UserController",tags = "UserController",description = "用户信息接口")
public class UserController {

    @PreAuthorize("hasAuthority('p1')")
    @GetMapping("/r/r1")
    public String r1(){
        return "okr1";
    }

    @PreAuthorize("hasAuthority('p2')")
    @GetMapping("/r/r2")
    public String r2(){
        return "okr2";
    }

    /*@GetMapping(value = "/User" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "查询用户", notes = "查询用户")
    public JsonData getUse(UserParam param){
        *//*System.out.println("param:"+param);
        param.setUsername("11");
        if(param.getDeptId()!=null){
            throw new ParamException("111111111111");
        }*//*
        //BeanValidator.check(param);
        return  JsonData.success(param);
    }

    @PostMapping(value = "/User" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "插入用户", notes = "插入用户")
    public JsonData setUse(UserParam param){
        *//*System.out.println("param:"+param);
        param.setUsername("11");
        if(param.getDeptId()!=null){
            throw new ParamException("111111111111");
        }*//*
        //BeanValidator.check(param);
        return  JsonData.success(param);
    }

    @PutMapping (value = "/User" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "更新用户", notes = "更新用户")
    public JsonData putUse(UserParam param){
        *//*System.out.println("param:"+param);
        param.setUsername("11");
        if(param.getDeptId()!=null){
            throw new ParamException("111111111111");
        }*//*
        //BeanValidator.check(param);
        return  JsonData.success(param);
    }

    @DeleteMapping(value = "/User" , produces = "application/json; charset=utf-8")// 解决返回值乱码问题
    @ApiOperation(value = "更新用户", notes = "更新用户")
    public JsonData deleteUse(UserParam param){
        *//*System.out.println("param:"+param);
        param.setUsername("11");
        if(param.getDeptId()!=null){
            throw new ParamException("111111111111");
        }*//*
        //BeanValidator.check(param);
        return  JsonData.success(param);
    }*/
}
