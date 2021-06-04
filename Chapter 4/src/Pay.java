public class Pay {
    private double hoursWorked;
    private double rateOfPayPerHour;
    private double withHoldingRate;
    private double grossPay;
    private double netPay;

    public static void computeNetPay(double grossPay, double hoursWorked, double rateOfPayPerHour, double withHoldingRate){
        grossPay = hoursWorked * rateOfPayPerHour;
        System.out.println("The gross pay is = " + grossPay);
    }
    public static void computeNetPay(double rateOfPayPerHour, double withHoldingRate){
        withHoldingRate = 15;

    }
    public static void computeNetPay(double hourlyRate){

    }
}
