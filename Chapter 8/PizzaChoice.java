import javax.swing.*;
import java.util.Scanner;

public class PizzaChoice {
    public static void main(String[] args){
        final int NUMBER_OF_CHOICES = 5;
        String[] pizzaSize = {"N","S","M","L","X"};
        double[] pizzaPrice = {0.0,6.99,8.99,12.50,15.00};

        double Prices = 0.0;
        boolean validChoice = false;
        String sizeChosen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        sizeChosen = sc.nextLine();


        for(int x = 0; x < NUMBER_OF_CHOICES;x++)
        if(sizeChosen.equals(pizzaSize[x])) {
            validChoice = true;
            Prices = pizzaPrice[x];
        }
        if(validChoice){
            JOptionPane.showMessageDialog(null," The price of " + sizeChosen + " pizza is " + Prices);
        }else{
            JOptionPane.showMessageDialog(null, " Wrong Entry ");
        }
    }

}
