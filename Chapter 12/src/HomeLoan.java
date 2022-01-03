public class HomeLoan extends PersonalLoan{
    double costPerMonthHome;
    String typeOfHome;
    public HomeLoan(String home, double cost){
        typeOfHome = home;
        costPerMonthHome = cost;
    }
    @Override
    public String toString() {
        return "The cost of the house per month is : " + costPerMonthHome + "\n" + "The type of home is : " + typeOfHome;
    }
}
