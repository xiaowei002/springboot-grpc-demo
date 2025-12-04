package com.weiguowei.service;

import com.weiguowei.dto.OrderConfirmRequest;

public interface OrderService {
    void confirmOrder(OrderConfirmRequest request);
}
