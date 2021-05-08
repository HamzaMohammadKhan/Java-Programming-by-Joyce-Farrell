public class Client {
    private int clientNumber;
    private String firstName;
    private String lastName;
    private int attorneyID;
    private int balanceOwned;

    //1
    int getClientNumber(){
        return clientNumber;
    }
    void setClientNumber(int cn) {
        clientNumber = cn;
    }
    //2
    String getFirstName(){
        return firstName;
    }
    void setFirstName(String fn){
        firstName = fn;
    }
    //3
    int getAttorneyID(){
        return attorneyID;
    }
    void setAttorneyID(int ID){
        attorneyID = ID;
    }
    //4
    String getLastName(){
        return lastName;
    }
    void setLastName(String ln){
        lastName = ln;
    }
    //5
    int getBalanceOwned(){
        return balanceOwned;
    }
    void setBalanceOwned(int b){
        balanceOwned = b;
    }
    public void DisplayClient(){
        System.out.println(" \n\t Your Client Number :  " +  clientNumber);
        System.out.println(" \t The Attorney ID :  " +  attorneyID);
        System.out.println(" \t Your Client's first name :  " +  firstName);
        System.out.println(" \t Your Client's last name :  " +  lastName);
        System.out.println(" \t the balance owned to the firm : " + balanceOwned);
    }
}
