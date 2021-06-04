import java.util.*;
import java.lang.*;
import javax.swing.JOptionPane;

public class Summer {
    public static void main(String[] args){
       // daysBetween = (difference / (1000*60*60*24))
       GregorianCalendar myCalendar = new GregorianCalendar();
       int difference, YourDate, currentDate;
       YourDate = Integer.parseInt(JOptionPane.showInputDialog(null," Summer date "));
       currentDate = myCalendar.get(Calendar.DATE);
       difference = YourDate - currentDate;
       JOptionPane.showMessageDialog(null,"There are " + difference + " left in summer " );
    }
}
