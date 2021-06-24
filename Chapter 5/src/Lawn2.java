import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lawn2 {
    public static void main(String[] args){
        Lawn obj1 = new Lawn();
        Scanner sc = new Scanner(System.in);
        int length1, length2, length3, width1, width2, width3,weeklyFee, totalSqFt, totalCost;
        String pay,payOnce, payTwice, payThrice;

        pay = JOptionPane.showInputDialog(null,"Choose pay" + "\n" + "1. weekly pay" + "\n" + "2. seasonal pay");
        weeklyFee = obj1.getWeeklyFee1() ; obj1.getWeeklyFee2(); obj1.getWeeklyFee3();
        weeklyFee = Integer.parseInt(pay);
        /*weeklyFee1 = obj1.getWeeklyFee1();
        weeklyFee2 = obj1.getWeeklyFee2();
        weeklyFee3 = obj1.getWeeklyFee3();
        totalCost = obj1.setSeasonalFee1(20) * obj1.getWeeklyFee1();
        length1 = obj1.setLength1(15);
        width1 = obj1.setWidth1(20);
        totalSqFt = length1*width1;
        System.out.println("Your total cost " + totalCost);*/
    }
}
