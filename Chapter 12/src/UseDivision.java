public class UseDivision {
    public static void main(String[] args){
        InternationalDivision obj1 = new InternationalDivision("hamza", 1234,"pakistan","Urdu and English" );
        DomesticDivision obj2 = new DomesticDivision("Khan", 123,"Karachi");

        obj1.display();
        System.out.println("\n");
        obj2.display();
    }
}
