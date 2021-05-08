public class Attorney {
    private String firstName;
    private String lastName;
    private int ID_number;
    private double annualSalary;

    //1
    int getID_number(){
        return ID_number;
    }
    void setID_number(int ID){
        ID_number = ID;
    }
    //2
    double getAnnualSalary(){
        return annualSalary;
    }
    void setAnnualSalary(double a){
        annualSalary = a;
    }
    //3
    String getFirstName(){
        return firstName;
    }
    void setFirstName(String f){
        firstName = f;
    }
    //4
    String getLastName(){
       return lastName;
    }
    void setLastName(String l){
        lastName = l;
    }
    public void DisplayAttorney(){
        System.out.println(" \n\t The Id number : " + ID_number);
        System.out.println(" \t The Attorney's first name : " + firstName);
        System.out.println(" \t The Attorney's last name : " + lastName);
        System.out.println(" \t The annual salary : " + annualSalary);
    }
}
