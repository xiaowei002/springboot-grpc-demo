package com.weiguowei.controller;

import com.weiguowei.dto.OrderConfirmRequest;
import com.weiguowei.service.OrderService;
import com.weiguowei.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/confirmOrder")
    public BaseResponse confirmOrder(@RequestBody OrderConfirmRequest request){
        orderService.confirmOrder(request);
        return BaseResponse.buildSuccess();
    }
}
