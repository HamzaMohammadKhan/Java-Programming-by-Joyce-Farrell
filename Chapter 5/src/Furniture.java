import javax.swing.JOptionPane;
import java.util.Scanner;

public class Furniture {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int table1, table2;
            int price_pine= 100;
            int price_oak = 225;
            int price_mahogany = 310;
            int tableLarge = 35;
            int tableSmall = 25;

            String tableInput;
            String tableSize;

            tableInput = JOptionPane.showInputDialog(null, "Enter the number for table details " + "\n" + "1. Pine" + "\n" +"2. Oak"+"\n"+ "3. Mahogany");
            table1 = Integer.parseInt(tableInput);

            tableSize = JOptionPane.showInputDialog(null, "What size do you want" + "\n" + "1. Large" +"\n" +"2. Small " + "\n" + "3. Standard");
            table2 = Integer.parseInt(tableSize);

            switch(table1) {
                case 1:
                    JOptionPane.showMessageDialog(null, "The original price of Pine table cost " + price_pine + "$");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "The original price of Oak table is " + price_oak);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "The original price of Mahogany table is " + price_mahogany);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, " Invalid number try again ");
                    break;
            }
            switch (table2){
                case (1):
                    JOptionPane.showMessageDialog(null, "The additional charges for the large tables will be " + "\n" + "Pine " + (price_pine + tableLarge) + " $" +"\n" +"Oak " + (price_oak + tableLarge) + " $" +"\n" + "Mahoagny " + (price_mahogany + tableLarge) + " $");
                    break;
                case (2):
                    JOptionPane.showMessageDialog(null,"the additonal charges for smaller table will be " + "\n" +"Pine "+ (price_pine + tableSmall) + " $" + "\n" + "Oak "+ (price_oak + tableSmall) +" $" + "\n" + "Mahogany " + (price_mahogany + tableSmall) + " $");
                    break;
                case 3:
                    break;
            }
    }
}
