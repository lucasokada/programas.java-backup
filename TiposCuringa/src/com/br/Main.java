package com.br;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<Shape>();

        list.add(new Circle(1.5));
        list.add(new Rectangle(3, 8.65));
        list.add(new Circle(3.56));

        List<Circle> list1 = new ArrayList<Circle>();
        list1.add(new Circle(5.4));
        list1.add(new Circle(0.75));

        double sumShape = totalArea(list);
        double sumCircle = totalArea(list1);

        System.out.println("list Shape: " + sumShape + "\n" + "list Circle: " + sumCircle);

    }

    public static double totalArea(List<? extends Shape> list) //suporta tanto o supertipo(shape) quanto os subtipos(circle e rectangle)
    {
        double sum = 0;

        for(Shape o : list)
        {
            sum += o.area();
        }

        return sum;
    }
}
