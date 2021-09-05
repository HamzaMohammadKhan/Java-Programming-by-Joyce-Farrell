public class TestCustomer {
    public static void main(String[] args){
        Customer oneCusto = new Customer(124, 123.45);
        PreferredCustomer onePCusto = new PreferredCustomer(125, 3456.78, 0.15);
        oneCusto.display();
        onePCusto.display();
    }
}
