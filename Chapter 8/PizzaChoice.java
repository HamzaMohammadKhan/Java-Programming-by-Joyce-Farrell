import javax.swing.*;

public class PizzaChoice {
    public static void main(String[] args){
       disPizza();
    }

    public static void disPizza(){
        int displayPizza,Type;
        String[] pizzaSize = {"N","S","M","L","X"};
        double[] pizzaPrice = {0.0,6.99,8.99,12.50,15.00};
        String enterPizza = JOptionPane.showInputDialog(null,"Enter choice : " );

        for(displayPizza = 0; displayPizza < 6; displayPizza++)
            for(Type = 0; Type < 6; Type++)
        if(displayPizza < pizzaSize.length && Type < pizzaPrice.length ){
            JOptionPane.showMessageDialog(null," The price of " + pizzaSize[displayPizza] + " pizza is " + pizzaPrice[Type]);
        }else{
            JOptionPane.showMessageDialog(null, " Wrong Entry ");
        }
    }
}
