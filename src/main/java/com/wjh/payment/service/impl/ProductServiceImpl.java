package com.wjh.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjh.payment.entity.Product;
import com.wjh.payment.service.ProductService;
import com.wjh.payment.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
    implements ProductService{

}




