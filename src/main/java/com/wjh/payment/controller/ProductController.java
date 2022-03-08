package com.wjh.payment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@Api(tags = "商品管理")
public class ProductController {

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public String test(){
        return "hello";
    }


}
