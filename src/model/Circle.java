package model;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}
