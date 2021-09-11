import java.util.Scanner;

public class Year {
    int numberOfDays;

    public Year(){
        numberOfDays = 365;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }
    public void daysElapsed(){
        Scanner sc=  new Scanner(System.in);
        int month;
        int days;

        System.out.println("Enter Number of days  : ");
        days = sc.nextInt();

        int daysLeft = numberOfDays - days;

        System.out.println("The days left are : " + daysLeft);
    }
}
