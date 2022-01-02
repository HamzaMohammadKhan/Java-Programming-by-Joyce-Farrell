public abstract class Insurance {
    protected String typeofInsurance;
    protected double monthlyPrice;

    public Insurance(String typeofIn){
        typeofInsurance = typeofIn;
    }

    public String getTypeofInsurance(){
        return typeofInsurance;
    }
    public double getMonthlyPrice(){
        return monthlyPrice;
    }

    public abstract void setCost();
    public abstract void display();
}
