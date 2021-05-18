public class TestPizza {
    public static void main(String[] args) {
        Pizzaa onePizza = new Pizzaa();
        double pr;
        int d;
        String top;
        onePizza.setToppings("peperonni");
        onePizza.setDiameter(12);
        onePizza.setPrice(13.99);
        pr = onePizza.getPrice();
        d = onePizza.getDiameter();
        top = onePizza.getToppings();
        System.out.println(" Your topping is : " + top + " \n Your diameter is :  " + d + " \n Your final price is : " + pr);
    }
}
