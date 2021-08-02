public class TaxPayer {
    int SocialSecurityNumber;
    double yearGrossIncome;

    public int getSocialSecurityNumber(){
        return SocialSecurityNumber;
    }
    public void setSocialSecurityNumber(){
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public double getYearGrossIncome(){
        return yearGrossIncome;
    }
    public void setYearGrossIncome(){
        this.yearGrossIncome = yearGrossIncome;
    }

    public  TaxPayer(int num, double gross){
        for(int x=1; x < num;x++)
            yearGrossIncome = gross;
        for(int y=0; y<gross; y++)
          SocialSecurityNumber = num;

    }
    public int displayNumber() {
            System.out.println(" Your security number " + SocialSecurityNumber);
        return SocialSecurityNumber;
    }
    public double displayGross(){
        System.out.println(" Your gross is " + yearGrossIncome);
        return yearGrossIncome;
    }
}
