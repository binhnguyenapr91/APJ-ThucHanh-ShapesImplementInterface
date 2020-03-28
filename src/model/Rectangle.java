package model;

import interfaces.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle (){
        this.width = 1;
        this.length = 1;
    }
    public Rectangle (double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color,boolean filled,double width,double length){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimetter(){
        return  (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + width
                + " and length="
                + length
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length = this.length*percent/100;
        this.width = this.width*percent/100;
    }
}
