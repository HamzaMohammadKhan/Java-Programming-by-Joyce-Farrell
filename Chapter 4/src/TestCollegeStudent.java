import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCollegeStudent {
    public static void main(String[] args){
        GregorianCalendar Calender = new GregorianCalendar();
        CollegeStudent obj1 = new CollegeStudent("Hamza", "Mohammad Khan", Calender.get(Calendar));
        CollegeStudent obj2 = new CollegeStudent("ali", "shah",);
        JOptionPane.showMessageDialog();

    }
}
