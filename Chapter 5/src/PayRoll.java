import javax.swing.JOptionPane;

public class PayRoll {
    public static void main(String[] args){
        String hoursString;
        double rate = 20.00;
        double hourWorked;
        double regularPay;
        double overTime;
        hoursString = JOptionPane.showInputDialog(null,"how many hours did you work this week ?");
        hourWorked = Double.parseDouble(hoursString);
        if(hourWorked > 40){
            regularPay = 40 * rate;
            overTime = (hourWorked -40) * 1.5 * rate;
        }
        else{
            regularPay = hourWorked * rate;
            overTime = 0.0;
        }
        JOptionPane.showMessageDialog(null,"Regular pay is " + regularPay + "\nOvertime pay is " + overTime);
        System.exit(0);
    }
}
