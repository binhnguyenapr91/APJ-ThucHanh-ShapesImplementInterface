package test;

import model.Circle;
import model.ComparableCircle;
import java.util.Arrays;

public class ComparabelCircleTesting {
    public static void main(String[] args) {
        ComparableCircle[] listCircle = new ComparableCircle[3];
        listCircle[0] = new ComparableCircle("blue",true,2);
        listCircle[1] = new ComparableCircle("red",true,6);
        listCircle[2] = new ComparableCircle("green",true,3);

        System.out.println("Before sort:");
        for(ComparableCircle cc : listCircle){
            System.out.println(cc);
        }

        Arrays.sort(listCircle);

        System.out.println("After sort:");
        for(ComparableCircle cc : listCircle){
            System.out.println(cc);
        }
    }
}
