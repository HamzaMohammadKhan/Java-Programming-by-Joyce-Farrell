public class Invoice {
   private int month;
   private int day;
   private int year;
   private int in_number;
   private double balance_due;

   Invoice(int month, int in_number, int day, int year){
       if(in_number < 1000){
           System.out.println("Your invoice number is 0");
       }
       if(month < 1 || month > 12) {
          System.out.println("Your month is 0");
       }
       if(day < 1 || day > 31 || day > 30 || day > 29){//Invoice2.java
          System.out.println("Your day is 0");
       }
       if(year < 2005 || year > 2012 || year == 2008) {
           System.out.println("Your year is 0");
       }
   }
   int getMonth(){
       return month;
   }
   int getDay(){
       return day;
   }
   int getYear(){
       return year;
   }
   int getIn_number(){
       return in_number;
   }
   double getBalance_due(){
       return balance_due;
   }
   int setMonth(){
       this.month = month;
       return month;
   }
   int setDay(){
       this.day = day;
       return day;
   }
   int setYear(){
       this.year = year;
       return year;
   }
   int setIn_number(){
       this.in_number = in_number;
       return year;
   }
}
