public class CheckingAccount {
    private int accountNumber;
    private double accountBalance;
    static double minimumBalance = 200.00;

    int getAccountNumber(){
        return accountNumber;
    }
    double getAccountBalance(){
        return accountBalance;
    }

    CheckingAccount(int accountNumber, double accountBalance){
      this.accountNumber = accountNumber;
      this.accountBalance = accountBalance;
    }
    CheckingAccount(double accountBalance){
      this.accountBalance = accountBalance;
    }
}
