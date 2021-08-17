import javax.swing.*;

public class PhoneBook {
    public static void main(String[] args){

        int[] phoneNumbers = new int[20];
        String[] names = new String[20];
        String stringNames = " ";
        int x=0, numEntered;
        int highestSub = names.length - 1;
        int y=0, numEntered1;
        int subnumber = phoneNumbers.length - 1;
        names[x] = JOptionPane.showInputDialog(null,"Enter names ");
        String enterNumber = JOptionPane.showInputDialog(null, "Enter number");
        while(!names[x].equals("zzz") && x < highestSub){
            stringNames = stringNames + names[x] + "\n";
            phoneNumbers[y] = Integer.parseInt(enterNumber);
            ++x;
            ++y;
            if(x < highestSub){
                names[x] = JOptionPane.showInputDialog(null, "Enter names ");
            }
            if(y < subnumber){
                JOptionPane.showMessageDialog(null,"error");
            }
            numEntered = x;
            numEntered1 = y;
        }
    }
}
