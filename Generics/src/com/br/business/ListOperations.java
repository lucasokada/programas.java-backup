package com.br.business;

import com.br.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ListOperations<T> {

    private List<T> list = new ArrayList<>();

    public void addList(T object)
    {
       list.add(object);
    }
}
