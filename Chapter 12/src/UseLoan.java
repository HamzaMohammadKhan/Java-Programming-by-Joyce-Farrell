public class UseLoan {
    public static void main(String[] args){
        CarLoan obj1 = new CarLoan("Race", 30000);
        HomeLoan obj2 = new HomeLoan("House", 12000);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
