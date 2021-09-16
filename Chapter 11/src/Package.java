import java.util.*;

public class Package {
    final double [][] prices = {{2.00, 3.00, 4.50},
                                {1.50, 2.35, 3.25},
                                {0.50, 1.50, 2.15}};
    double weightOunces;
    double shippingCost;
    char shippingMethod;

    /* weight (oz.)    Air($)    Truck($)     Mail ($)
       1 to 8          2.00      1.50         .50
       9 to 16         3.00      2.35         1.50
       17 and over     4.50      3.25         2.15
     */

    public void calculateCost(){
        if(weightOunces >= prices[0][0] && weightOunces >= prices[1][0]){
            switch(shippingMethod){
                case 'A':
                    System.out.println(prices[0][0]);
                    break;

                case'T':
                    System.out.println();
            }
        }
    }

    public void display(){
        shippingMethod = ;
    }
}
