package test;

import model.Circle;
import model.ComparatorCircle;

import java.util.Arrays;

public class ComparatorCircleTesting {
    public static void main(String[] args) {
        Circle[] circleList = new Circle[3];
        circleList[0] = new Circle(7);
        circleList[1] = new Circle();
        circleList[2] = new Circle("red",true,3);

        System.out.println("Before sort:");
        for(Circle c : circleList){
            System.out.println(c);
        }
        ComparatorCircle comparatorCircle= new ComparatorCircle();
        Arrays.sort(circleList,comparatorCircle);

        System.out.println("After sort");
        for(Circle c : circleList){
            System.out.println(c);
        }
    }
}
