package model;
import java.util.Comparator;
public class ComparatorCircle extends Circle implements Comparator<Circle> {
    public ComparatorCircle(){

    }
    public ComparatorCircle(double radius){
        super(radius);
    }
    public ComparatorCircle(String color, boolean filled, double radius){
        super(color, filled, radius);
    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
