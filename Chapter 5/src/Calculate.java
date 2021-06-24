import javax.swing.*;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        int a1,b1,a2,b2;
        String c,d,e;
        Scanner sc = new Scanner(System.in);
        c = JOptionPane.showInputDialog(null, "Choose the operation  " + "\n" + "1. Addition" + "\n" + "2. Subtraction" + "\n" + "3. Multiplication "+ "\n" + "4. Division ");
        a1 = Integer.parseInt(c);
        switch(a1){
            case 1:
                d = JOptionPane.showInputDialog(null, "Enter first number ");
                b1 = Integer.parseInt(d);

                e = JOptionPane.showInputDialog(null, "Enter second number ");
                a2 = Integer.parseInt(e);

                double d1 = a2;
                double c1 = b1;
                JOptionPane.showMessageDialog(null, "Your answer is " + (c1+d1));
                break;
            case 2:
                d = JOptionPane.showInputDialog(null, "Enter first number ");
                b1 = Integer.parseInt(d);

                e = JOptionPane.showInputDialog(null, "Enter second number ");
                a2 = Integer.parseInt(e);

                double d2 = a2;
                double c2 = b1;
                JOptionPane.showMessageDialog(null, "Your answer is " + (c2-d2));
                break;
            case 3:
                d = JOptionPane.showInputDialog(null, "Enter first number ");
                b1 = Integer.parseInt(d);

                e = JOptionPane.showInputDialog(null, "Enter second number ");
                a2 = Integer.parseInt(e);

                double d3 = a2;
                double c3 = b1;
                JOptionPane.showMessageDialog(null, "Your answer is " + (c3*d3));
                break;
            case 4:
                d = JOptionPane.showInputDialog(null, "Enter first number ");
                b1 = Integer.parseInt(d);

                e = JOptionPane.showInputDialog(null, "Enter second number ");
                a2 = Integer.parseInt(e);

                double d4 = a2;
                double c4 = b1;
                JOptionPane.showMessageDialog(null, "Your answer is " + (c4/d4));
                if(d4==0){
                    JOptionPane.showMessageDialog(null,"Error" + " " + JOptionPane.ERROR_MESSAGE);
                }
        }
        System.exit(0);
    }
}
