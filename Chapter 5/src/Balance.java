import javax.swing.JOptionPane;

public class Balance {
    public static void main(String[] args) {
        double saveBalance;
        double checkBalance;
        String BalanceCheck, BalanceSave;

        BalanceCheck = JOptionPane.showInputDialog(null, "Enter balance amount ");
        checkBalance = Double.parseDouble(BalanceCheck);

        BalanceSave = JOptionPane.showInputDialog(null, "Your saved amount ");
        saveBalance = Double.parseDouble(BalanceSave);

        if (checkBalance < 10) {
            JOptionPane.showMessageDialog(null, "Checking account Balance is Low ");
        }
                if (saveBalance < 100) {
                    JOptionPane.showMessageDialog(null, "Saving account balance is low ");
                }
                if (checkBalance < 10 && saveBalance < 100) {
                    JOptionPane.showMessageDialog(null, "both accounts are dangerously low");
                }
                System.exit(0);
            }
        }

