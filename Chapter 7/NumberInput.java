import javax.swing.*;
public class NumberInput {
    public static void main(String[] args){
        String inputString;
        int inputNumber;
        final int MAX_GUESTS = 100;
        inputString = JOptionPane.showInputDialog(null,"Enter the number of guests at your event");
        inputNumber = Integer.parseInt(inputString);
        if(inputNumber > MAX_GUESTS){
            JOptionPane.showMessageDialog(null,"A surcharge will apply");
        }
        System.exit(0);
    }

}
