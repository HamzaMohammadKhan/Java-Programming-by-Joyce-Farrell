import javax.swing.*;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class IQ {
    public static void main(String[] args){
   //less than 0 greater than 200 error
        Scanner sc = new Scanner(System.in);
        int IQ;
        String inputIQ;
        inputIQ = JOptionPane.showInputDialog(null, "Input your Iq score");
        IQ = Integer.parseInt(inputIQ);
            if (IQ >= 100)
                if(IQ <= 100)
                JOptionPane.showMessageDialog(null, "above average");
                if(IQ <=  0){
                    JOptionPane.showMessageDialog(null,"error");
                }if(IQ > 200){
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
    }
