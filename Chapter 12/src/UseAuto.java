public class UseAuto {
    public static void main(String[] args){
        Ford obj1 = new Ford();
        Chevy obj2 = new Chevy();
        {
            obj1.setMake("Mustang");
            obj1.setPrice();
            double price = obj1.getPrice();
            String make = obj1.getMake();
            System.out.println("The price is : " + price + "\n" + "The make is : " + make);
        }
        {
            obj2.setMake("Camero");
            obj2.setPrice();
            double price = obj2.getPrice();
            String make = obj2.getMake();
            System.out.println("The price is : " + price + "\n" + "The make is : " + make);
        }
    }
}
