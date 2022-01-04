public class House extends Building{
    int numberOfBedrooms;
    int baths;

    public int getNumberOfBedrooms(){
        return numberOfBedrooms;
    }
    public int getBaths() {
        return baths;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms){
        this.numberOfBedrooms = numberOfBedrooms;
    }
    public void setBaths(int baths){
        this.baths = baths;
    }
}
