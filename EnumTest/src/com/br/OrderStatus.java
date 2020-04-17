package com.br;

public enum OrderStatus {
    PENDING_PAYMANT (1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4);

    private int value;

    private OrderStatus(int value)
    {
        this.value = value;
    }

}

