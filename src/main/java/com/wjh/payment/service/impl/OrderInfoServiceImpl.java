package com.wjh.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjh.payment.entity.OrderInfo;
import com.wjh.payment.service.OrderInfoService;
import com.wjh.payment.mapper.OrderInfoMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo>
    implements OrderInfoService{

}




