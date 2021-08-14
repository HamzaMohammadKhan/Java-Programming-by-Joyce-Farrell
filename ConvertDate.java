import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;

public class ConvertDate {
    public static void main(String[] args) {
        String InputDate;
        String[] CalenderArray = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Date obj1 = new Date();
        SimpleDateFormat obj2 = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = obj2.format(obj1);
        //JOptionPane.showMessageDialog(null,strDate);
        

    }
    public static int isValidMonth(int Month){
        int m = Month;
        if(m < 1 && m > 12){
            JOptionPane.showMessageDialog(null,"Your number does not match");
        }

    }
}
