package com.lt.ecommerce.util;

public enum UserInput {
    CUSTOMER,
    SELLER,
    DELIVERY_AGENT,
    SHOP,
    PRODUCT,
    ORDER;
    public final int value = 1 + ordinal();
}