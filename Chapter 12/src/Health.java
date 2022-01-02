public class Health extends Insurance{
    public Health(){
        super("Health");
        setCost();
    }

    @Override
    public void setCost() {
     monthlyPrice = 196;
    }
    public void display() {
        System.out.println("Insurance type : " + getTypeofInsurance() + "\n" + "Price : " + getMonthlyPrice());
    }
}
