import java.util.GregorianCalendar;
import java.util.Scanner;

public class TwelveDays {
    /*On the first day of Christmas my true love gave to me
    A partridge in a pear tree
    On the second day of Christmas my true love gave to me
    Two turtle doves and a partridge in a pear tree
    On the third day of Christmas my true love gave to me
    Three French hens, two turtle doves and a partridge in a pear tree
    On the fourth day of Christmas my true love gave to me
    Four calling birds, three French hens
    Two turtle doves and a partridge in a pear tree
    On the fifth day of Christmas my true love gave to me
    Five gold rings, four calling birds, three French hens
    Two turtle doves and a partridge in a pear tree
    On the sixth day of Christmas my true love gave to me
    Six geese a laying, five gold rings
    Four calling birds, three French hens
    Two turtle doves and a partridge…*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your day : ");
        String day;
        day = sc.nextLine();
        switch(day){
            case "Monday":
                System.out.println("my true love gave to me " + " A partridge in a pear tree");
                break;
            case "Tuesday":
                System.out.println("my true love gave to me " + " Two turtle doves and a partridge in a pear tree");
                break;
            case "Wednesday":
                System.out.println("my true love gave to me" + " Three French hens, two turtle doves and a partridge in a pear tree");
                break;
            case "Thursday":
                System.out.println("my true love gave to me " + " Four calling birds, three French hens " + " Two turtle doves and a partridge in a pear tree");
                break;
            case "Friday":
                System.out.println("my true love gave to me " + " Six geese a laying, five gold rings " +  " Four calling birds, three French hens " +
                        " Two turtle doves and a partridge");
                break;
        }
    }
}
