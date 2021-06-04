import java.util.*;
import java.lang.*;
import java.time.*;

public class Year {
    public static void main(String[] args){
        GregorianCalendar myCalendar = new GregorianCalendar();
        int currentDate = myCalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("the current days are " + currentDate + " days right now ");
        int daysLeft = 366 - currentDate;
        System.out.println("the number of days left this year are  " + daysLeft + " days ");
    }
}
