import java.util.prefs.PreferencesFactory;

public class PreferredCustomer
{
    double discountRate;
    public PreferredCustomer(int id, double bal, double rate){
        //super(id, bal);
        discountRate = rate;
    }
    public void display()
    {
        //super.display();
        System.out.println("Discount rate" + discountRate);
    }
}
