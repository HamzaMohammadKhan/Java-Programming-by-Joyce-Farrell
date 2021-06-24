public class ifelse {
    public static void main(String[] args) {
        int someVariable = 5;
        if (someVariable == 10) {
            System.out.println("Value is true");
        }
        int hoursWorked = 50;
        int regularPay = 0;
        double overTime;
        int rate = 12;
        if (hoursWorked > 40) {
            regularPay = 40 * rate;
            overTime = (hoursWorked - 40) * 1.5 * rate;
            System.out.println(" Regular pay is " + regularPay);
            System.out.println("OverTime pay is " + overTime);
        }
        if (hoursWorked > 40)
            regularPay = 40 * rate;// if structure ends
        overTime = (hoursWorked - 40) * 1.5 * rate;
        System.out.println(" Regular pay is " + regularPay);
        System.out.println("OverTime pay is " + overTime);

        int bonus = 0;
        int itemsSold = 6;
        int totalValue = 101;
        if (itemsSold > 3 && totalValue > 100)
            System.out.println(true || false);
        bonus = 50;
    }
}

