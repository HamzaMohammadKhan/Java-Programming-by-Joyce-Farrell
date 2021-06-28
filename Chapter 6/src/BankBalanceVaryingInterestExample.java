import javax.swing.*;

public class BankBalanceVaryingInterestExample {
    public static void main(String[] args){
        int selection;
        String balanceString;
        int tempBalance;
        double balance;
        int year = 1;
        double interest;
        balanceString = JOptionPane.showInputDialog(null,"Enter initial bank balance");
        balance = Double.parseDouble(balanceString);
        selection = JOptionPane.showConfirmDialog(null,"Do you want to see next year's balance ");
        while(selection == JOptionPane.YES_OPTION){
            for(interest = 0.02; interest <= 0.05; interest += 0.01) {
                balance = balance + balance ;
                //Next two statements Round the balance
                tempBalance = (int) (balance * 100);
                balance = tempBalance / 100.0;
                JOptionPane.showMessageDialog(null,"After " + year + " years at " + interest + " interest balance is " +balance );
            }
            selection = JOptionPane.showConfirmDialog(null,"\nDo you want to see the balance at the end " + "\nof another year ? ");
            year = year + 1;
        }
        System.exit(0);

    }
}
