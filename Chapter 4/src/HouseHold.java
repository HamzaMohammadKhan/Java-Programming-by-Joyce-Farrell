public class HouseHold {
    private double incomeTax;
    private int numberOfOccupants;

    double getIncomeTax(){
        return incomeTax;
    }
    void setIncomeTax(){
        this.incomeTax = incomeTax;
    }
    int getNumberOfOccupants(){
        return numberOfOccupants;
    }
    void setNumberOfOccupants(){
        this.numberOfOccupants = numberOfOccupants;
    }
    public HouseHold(){
        numberOfOccupants = 1;
        incomeTax = 0;
    }
    public HouseHold(int numberOfOccupants){
        this.numberOfOccupants = numberOfOccupants;
    }
    public HouseHold(int numberOfOccupants, double incomeTax){
        this.numberOfOccupants = numberOfOccupants;
        this.incomeTax = incomeTax;
    }
}
