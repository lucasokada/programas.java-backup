package com.br;

import java.util.Date;

public class Order {
    private int id;
    private Date moment;
    private OrderStatus status;

    public Order(int id, Date moment, OrderStatus status)
    {
        this.status = status;
        this.id = id;
        this.moment = moment;
    }

    public void setId(int id1)
    {
        this.id = id1;
    }

    public int getId()
    {
        return id;
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setStatus(OrderStatus status1)
    {
        this.status = status1;
    }

    public String toString()
    {
        return "Order [id = " + id + ", moment = " + moment + ", status = " + status + "]";
    }
}
