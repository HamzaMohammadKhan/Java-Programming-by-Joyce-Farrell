public class Vehicle {
    private int numberOfWheels;
    private int milesPerGallon;

    public Vehicle(int num, int gal){
        numberOfWheels = num;
        milesPerGallon = gal;
        }

    @Override
    public String toString() {
        return numberOfWheels+ " " + milesPerGallon;
    }
}
