public class TestHouseHold {
    public static void main(String[] args){
        HouseHold house = new HouseHold();
        HouseHold house2 = new HouseHold(2);
        HouseHold house3 = new HouseHold(2,3);
        System.out.println("The tax is = " + house.getIncomeTax() + "\n" + "The occupants are = " + house.getNumberOfOccupants());
        System.out.println(" The new number of occupants are " + house2.getNumberOfOccupants());
        System.out.println(" The new number of occupants are " + house3.getNumberOfOccupants() + " and " + house.getNumberOfOccupants());
    }
}
