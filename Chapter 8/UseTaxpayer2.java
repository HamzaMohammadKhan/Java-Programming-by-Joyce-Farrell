public class UseTaxpayer2 {
    public static void main(String[] args){
        TaxPayer[] obj1 = new TaxPayer[10]; //10,000 to 100,000 and 1 to 10
        TaxPayer obj2 = new TaxPayer(10,10000);
        for(int x=0; x<obj1.length;++x){
             obj2.displayGross();
             obj2.displayNumber();
        }
    }
}
