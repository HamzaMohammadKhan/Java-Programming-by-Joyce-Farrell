import javax.swing.*;
import java.awt.*;

public class BankBalanceExample {
    public static void main(String[] args){
        int selection;
        String balanceString;
        int tempBalance;
        double balance;
        int year = 1;
        final double INT_RATE = 0.03;
        balanceString = JOptionPane.showInputDialog(null,"Enter initial bank balance");
        balance = Double.parseDouble(balanceString);
        selection = JOptionPane.showConfirmDialog(null,"Do you want to see next year's balance ");
        while(selection == JOptionPane.YES_OPTION){
            balance  = balance + INT_RATE;
            //Next two statements Round the balance
            tempBalance = (int)(balance * 100);
            balance = tempBalance / 100.0;
            selection = JOptionPane.showConfirmDialog(null,"After " + year + "y ears at " + INT_RATE + " interest rate, balance is " + balance + "\nDo you want to see the balance at the end " + "\nof another year ? ");
            year = year + 1;
        }
        System.exit(0);

    }
}
