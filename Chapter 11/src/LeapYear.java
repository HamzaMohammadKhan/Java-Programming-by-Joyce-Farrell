import java.util.Scanner;

public class LeapYear extends Year{
    public LeapYear(){
        numberOfDays = 366;
    }
    public void daysElapsed(){
        Scanner sc=  new Scanner(System.in);
        int month1;
        int days1;

        System.out.println("Enter Number of days  : ");
        days1 = sc.nextInt();

        int daysLeft = numberOfDays - days1;

        System.out.println("The days left are : " + daysLeft);
    }
}
