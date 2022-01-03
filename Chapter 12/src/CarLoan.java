public class CarLoan extends PersonalLoan{
    double costPerMonthCar;
    String carType;
    public CarLoan(String car, double cost){
        carType = car;
        costPerMonthCar = cost;
    }
    public String toString(){
        return "The cost of the car per month is " + costPerMonthCar + "\n" + "The car type is : " + carType;
    }
}
