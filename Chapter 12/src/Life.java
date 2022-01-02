public class Life extends Insurance{

    public Life(){
        super("Life");
        setCost();
    }
    public void setCost() {
        monthlyPrice = 36;
    }
    public void display(){
        System.out.println("Insurance type : " + getTypeofInsurance() + "\n" + "Price : " + getMonthlyPrice());
    }
}
