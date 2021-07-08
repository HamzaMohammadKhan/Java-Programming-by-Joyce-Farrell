//incomplete

import java.util.Optional;
import java.util.Scanner;

public class CreatePurchase {
    public static void main(String[] args){

        Purchase obj1 = new Purchase();
        int innNum = obj1.getInvoiceNumber();
        double amoSalTax = obj1.getAmountOfSaleTax();
        double amoSal = obj1.getAmountOfSale();

        obj1.setInvoiceNumber(1200);
        obj1.setAmountOfSale(123);
        obj1.setAmountOfSaleTax(1212);
        obj1.Display();
    }
}
