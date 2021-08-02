public class UseTaxpayer {
    public static void main(String[] args){
        TaxPayer[] obj1 = new TaxPayer[10];
        TaxPayer obj2 = new TaxPayer(99999,0);
        for(int x=0; x < obj1.length; x++){
            obj2.displayNumber();
            obj2.displayGross();
        }
    }
}
