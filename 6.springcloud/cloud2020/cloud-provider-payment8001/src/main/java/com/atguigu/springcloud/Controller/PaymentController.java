package com.atguigu.springcloud.Controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@XSlf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    public CommonResult create(Payment payment){

        paymentService.create(payment);
        return null;
    }
}
