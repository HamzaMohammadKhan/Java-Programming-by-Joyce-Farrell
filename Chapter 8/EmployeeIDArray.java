import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeIDArray {
    public static void main(String[] args) {
        int x, y;
        String n;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Names : ");

        String[] names = new String[20];
        int[] id = new int[20];

        for (y = 0; y < id.length; ++y) {
            System.out.println("Enter id : " + (y+1));
            id[y] = sc.nextInt();
        }
        System.out.println("The id is : " + id);

        for(x=0; x < names.length; ++x) {
            System.out.println("Enter name : " + (x + 1));
            names[x] = sc.nextLine();
        }
        System.out.println("the names are :" + Arrays.toString(names));
    }

}

