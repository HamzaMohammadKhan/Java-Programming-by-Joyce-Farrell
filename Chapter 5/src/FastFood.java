//incomplete

import javax.swing.*;

public class FastFood {
    public static void main(String[] args) {
        double CheeseBurger, Pepsi, Chips;
        String inputFood;

        inputFood = JOptionPane.showInputDialog(null, "Select food item" + "\n" + "1. Cheeseburger" + "\n" +"2. Pepsi" +"\n" + "3. Chips");
        CheeseBurger = Double.parseDouble(inputFood);
        Pepsi = Double.parseDouble(inputFood);
        Chips = Double.parseDouble(inputFood);

        if(CheeseBurger == 1){
            CheeseBurger = 4.99;
            JOptionPane.showMessageDialog(null,"Your cost is " + CheeseBurger);
        }
        if(Pepsi == 2){
            Pepsi = 2.00;
            JOptionPane.showMessageDialog(null,"Your cost is " + Pepsi);
        }
        if(Chips == 3){
            Chips = 0.75;
            JOptionPane.showMessageDialog(null,"Your cost is " + Chips);
        }
    }
}
