//Case project ... Add 5 clients and 2 Attorneys

public class LawFirm {
    public static void main(String[] args){
        //Clients
        Client Obj1 = new Client();
        Client Obj2 = new Client();
        Client Obj3 = new Client();
        Client Obj4 = new Client();
        Client Obj5 = new Client();

        //Attorney
        Attorney Obj1a = new Attorney();
        Attorney Obj2a = new Attorney();

        System.out.println("\t *************** LAW SUIT ************** ");
        //Print Client 1
        Obj1.setAttorneyID(12);
        Obj1.setClientNumber(22);
        Obj1.setFirstName("John");
        Obj1.setLastName("Tom");
        Obj1.setBalanceOwned(1210000);
        Obj1.DisplayClient();

        //Print Attorney 1
        Obj1a.setAnnualSalary(120000);
        Obj1a.setFirstName("Jay");
        Obj1a.setLastName("Clark");
        Obj1a.setID_number(1);
        Obj1a.DisplayAttorney();

        //Print Client 2
        Obj2.setAttorneyID(14);
        Obj2.setClientNumber(26);
        Obj2.setFirstName("Greg");
        Obj2.setLastName("Cass");
        Obj2.setBalanceOwned(110000);
        Obj2.DisplayClient();

        //Print Attorney 2
        Obj2a.setAnnualSalary(160500);
        Obj2a.setFirstName("Joe");
        Obj2a.setLastName("Matthew");
        Obj2a.setID_number(12);
        Obj2a.DisplayAttorney();
    }
}
