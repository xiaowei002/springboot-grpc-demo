package com.weiguowei.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Coupon {
    /**
     * 优惠券ID
     */
    private Integer id;

    /**
     * 优惠券金额
     */
    private BigDecimal amount;

    /**
     * 满减额度
     */
    private BigDecimal fullReduction;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 优惠券可用开始时间
     */
    private LocalDateTime startTime;

    /**
     * 优惠券结束时间
     */
    private LocalDateTime endTime;
}
