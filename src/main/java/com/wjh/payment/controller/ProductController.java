package com.wjh.payment.controller;

import com.wjh.payment.entity.Product;
import com.wjh.payment.service.ProductService;
import com.wjh.payment.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/product")
@Api(tags = "商品管理")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public R test(){
        return R.ok().data("message","hello").data("now",new Date());
    }

    @ApiOperation(value = "所有商品")
    @GetMapping("/list")
    public R list(){
        List<Product> list = productService.list();
        return R.ok().data("productList",list);
    }


}
