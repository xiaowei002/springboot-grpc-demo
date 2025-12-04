package com.weiguowei.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {

    /**
     * 商品ID
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;
}
