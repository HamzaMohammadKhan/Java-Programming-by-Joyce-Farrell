public class Shirt {
    private int collarSize;
    private double sleeveLength;
    static String Material = "cotton";

    int getCollarSize(){
        return collarSize;
    }
    double getSleeveLength(){
        return sleeveLength;
    }
    String getMaterial(){
        return Material;
    }
    public Shirt(int collarSize){
        this.collarSize = collarSize;
    }
    public Shirt(double sleeveLength){
        this.sleeveLength = sleeveLength;
    }

}
