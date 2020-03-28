package test;

import interfaces.Colorable;
import model.Circle;
import model.Rectangle;
import model.Square;

public class ColorableSquareTesting {
    public static void main(String[] args) {
        Square sq = new Square();
        Circle cc = new Circle();
        Rectangle re = new Rectangle();

        Object[] obj = new Object[3];
        obj[0] = sq;
        obj[1] = cc;
        obj[2] = re;

        for (Object o : obj){
            if (o instanceof Colorable){
                ((Colorable) o).howToColor();
            }else{
                System.out.println(o.toString() + " is not instance of Colorable");
            }
        }
    }
}
