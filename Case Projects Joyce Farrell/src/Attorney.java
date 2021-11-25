public class Attorney {
    int AttorneyID;
    String firstName;
    String lastName;
    double salary;

    public int getAttorneyID(){
        return AttorneyID;
    }
    public void setAttorneyID(int attorneyID) {
        AttorneyID = attorneyID;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstname) {
        firstName = firstname;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastname){
        lastName = lastname;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double Salary) {
        salary = Salary;
    }
}
