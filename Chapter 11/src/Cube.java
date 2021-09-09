//wrong formula

import java.util.Scanner;

public class Cube extends Square {
    private int depth;
    public void ComputeSurfaceArea(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter depth : ");
        depth = sc.nextInt();
        int A;
        A = 6*depth;
        System.out.println("The depth is : " + A);
    }
}
