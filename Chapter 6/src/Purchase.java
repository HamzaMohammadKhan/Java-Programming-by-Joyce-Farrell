public class Purchase {
    private int invoiceNumber;
    private double amountOfSale;
    private double amountOfSaleTax;

    int getInvoiceNumber(){
        return invoiceNumber;
    }
    void setInvoiceNumber(int IN) {
        invoiceNumber = IN;
    }
    double getAmountOfSale(){
        return amountOfSale;
    }
    void setAmountOfSale(double AS){
        amountOfSale = AS;
    }
    double getAmountOfSaleTax(){
        return amountOfSaleTax;
    }
    void setAmountOfSaleTax(double AST){
       //Total Sales Tax = Item Cost x Sales Tax Rate.
        amountOfSaleTax = AST;
    }
   public void Display(){
        double Total;
        Total = amountOfSale * amountOfSaleTax;

       if(invoiceNumber < 1000 || invoiceNumber > 8000 ){
           System.out.println("error");
       }else{
           System.out.println("Your invoice number is : " + getInvoiceNumber());
       }

       if(amountOfSale < 0){
           System.out.println("Error");
       }else{
           System.out.println("Your amount is : " + getAmountOfSale());
           System.out.println("The total is : " + Total);
       }

   }
}
