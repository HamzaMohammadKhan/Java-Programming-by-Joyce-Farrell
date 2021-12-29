public class InternationalDivision extends Division {
    String country;
    String language;

    public InternationalDivision(String name, int accountNo,String c, String l){
        super(name, accountNo);
        country = c;
        language = l;
    }
    public void display(){
        System.out.println("Your name is : " + name + "\n" + "Your account number : " + account_number);
        System.out.println("Your country is : " + country + "\n" + "Your language is : " + language);
    }

}
