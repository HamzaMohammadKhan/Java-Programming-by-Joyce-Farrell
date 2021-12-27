public abstract class Auto {
    double price;
    String make;

    public double getPrice(){
        return price;
    }
    public String getMake(){
        return make;
    }
    public abstract void setPrice();

    public void setMake(String m){
        make = m;
    }
}
