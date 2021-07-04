//incomplete

//Return of Investment = Net Profit / Total Investment * 100.
//ROI Formula:
//= [(Ending Value / Beginning Value) ^ (1 / # of Years)] – 1
import java.util.Scanner;

public class Investment{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter amount of Money : ");
       int amountMoney;
       amountMoney = sc.nextInt();

       System.out.println("Enter number of years : ");
       int numberOfyears;
       numberOfyears = sc.nextInt();

       if(amountMoney == 0 || numberOfyears == 0){
           System.out.println("Error");
       }
    }
}
