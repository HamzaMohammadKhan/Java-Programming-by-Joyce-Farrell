import javax.sql.rowset.serial.SerialJavaObject;
import javax.swing.*;

public class TravelTicketsCompany {
    public static void main(String[] args) {
        int Ticketnumber;
        String Inputnumber;
        Inputnumber = JOptionPane.showInputDialog(null, " Enter the number : ");
        Ticketnumber = Integer.parseInt(Inputnumber);

        int reminder1 = Ticketnumber % 10; //123454 % 10 = 4
        int temp = Ticketnumber / 10; //12345
        int reminder2 = temp % 7;

        if(reminder1 == reminder2){
            JOptionPane.showMessageDialog(null, " The value is true ");
        }else{
            JOptionPane.showMessageDialog(null, "the value is false ");
        }
    }
}
