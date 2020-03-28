package test;

import model.Rectangle;

public class ResizeableRectangleTesting {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println("Before resize:");
        System.out.println(rec);
        rec.resize(1000);
        System.out.println("After resize:");
        System.out.println(rec);
    }
}
