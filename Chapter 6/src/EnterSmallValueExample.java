import javax.swing.*;

public class EnterSmallValueExample {
     public static void main (String[] args){
       int userEntry;
       String userString;
       userString = JOptionPane.showInputDialog(null,"Please enter an integer no higher than 3 ");
       userEntry = Integer.parseInt(userString);
       while(userEntry > 3){
           userString = JOptionPane.showInputDialog(null,"The number you entered was too high \n " + "Please enter an integer lower ");
           userEntry = Integer.parseInt(userString);
       }
       JOptionPane.showMessageDialog(null,"You entered " + userEntry);
       System.exit(0);
     }

}
