public class UseOrder {
    public static void main(String[] args){
        Order obj1 = new Order();
        ShippedOrder obj2 = new ShippedOrder();

        obj1.setCustomerName("Hamza");
        obj1.setCustomerNumber(123);
        obj1.setUnitPrice(123);
        obj1.setQuantityOrdered(12);
        obj1.customerInfo();
        obj1.computePrice();

        obj2.computePrice();
    }

}
