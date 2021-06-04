public class TestCheckingAccount {
    public static void main(String[] args){
        CheckingAccount obj1 = new CheckingAccount(12,34);
        CheckingAccount obj2 = new CheckingAccount(32);

        System.out.println("the account number is " + obj1.minimumBalance + "\n" + " the account number is " + obj1.getAccountNumber() + "\n" + " the account balance is " + obj1.getAccountBalance());
    }
}
