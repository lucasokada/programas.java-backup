package entities;

public class Circle implements Shape{
    private final double PI = 3.1415;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * (Math.pow(radius, 2));
    }
}
