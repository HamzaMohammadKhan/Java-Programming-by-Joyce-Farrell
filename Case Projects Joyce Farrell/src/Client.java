public class Client {
    int ClientNumber;
    String firstName;
    String lastName;
    int primaryAttornyID;
    double balance;

    public int getClientNumber(){
        return ClientNumber;
    }
    public void setClientNumber(int num){
        ClientNumber = num;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double bal){
        balance = bal;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public int getPrimaryAttornyID(){
        return primaryAttornyID;
    }
    public void setPrimaryAttornyID(int ID){
        primaryAttornyID = ID;
    }
}
