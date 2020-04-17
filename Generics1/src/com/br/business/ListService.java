package com.br.business;

import java.util.ArrayList;
import java.util.List;

public class ListService<T> {

    private List<T> list = new ArrayList<>();

    public void addListElement(T obj)
    {
        list.add(obj);
    }

    public String showList(int position)
    {
        if(!list.isEmpty()) {
            return (String) list.get(position);
        }else{
            return null;
        }
    }

    public int listSize()
    {
        if(!list.isEmpty()){
            return list.size();
        }else{
            return 0;
        }
    }
}
