import java.util.Scanner;

public class Order {
    String customerName;
    int customerNumber;
    int quantityOrdered;
    int unitPrice;
    int totalPrice;

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String c){
        customerName = c;
    }
    //
    public int getCustomerNumber(){
        return customerNumber;
    }

    public void setCustomerNumber(int n) {
        customerNumber = n;
    }
    //
    public int getQuantityOrdered() {
        return quantityOrdered;
    }
    public void setQuantityOrdered(int q) {
        quantityOrdered = q;
    }

    public int getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(int u){
        unitPrice = u;
    }
    //print customer info
    public void customerInfo(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Customer name is : " + customerName);
        //customerName = sc1.nextLine();
        System.out.println("Customer id : " + customerNumber);
        //customerNumber = sc1.nextInt();
    }
    //function to compute
    public void computePrice(){
        Scanner sc= new Scanner(System.in);
        System.out.println("The quantity is : " + quantityOrdered);
        //quantityOrdered = sc.nextInt();

        System.out.println("The unit price of the product is : "+ unitPrice);
        //unitPrice = sc.nextInt();

        totalPrice = quantityOrdered * unitPrice;
        System.out.println("The total price is : " + totalPrice);
    }
}
