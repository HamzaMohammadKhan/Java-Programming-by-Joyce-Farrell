import java.util.*;
import java.lang.Math;

public class MathTest {
    public static void main(String[] args){
        //sqrt
        double a = Math.sqrt(30);
        System.out.println("square root is = " + a + "\n");

        //sin and cos
        double b = Math.sin(100);
        double c = Math.cos(b);
        System.out.println("The sin is = " + b + "\n" + "the cosine is = " + c + "\n");

        //floor, ceiling and round of 44.7
        double d = Math.round(44.7);
        System.out.println("the rounded of number is = " + d + "\n");

        //random number 0 to 10
        Random random = new Random();
        int min = 0;
        int max = 10;
        int e = random.nextInt(max + min) + min;
        System.out.println("Print number between 0-10 = " + e);
        }
    }

