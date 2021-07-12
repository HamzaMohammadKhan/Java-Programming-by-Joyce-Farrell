public class StringBufferNew {
    public static void main(String[] args){
        StringBuffer nameString = new StringBuffer("Barbara");
        int nameStringCapacity = nameString.capacity();
        System.out.println(" Capacity of nameString is " + nameStringCapacity);
        StringBuffer addressString = null;
        addressString = new StringBuffer("6311 Hickory Nut Grove Road");
        int addStringCapacity = addressString.capacity();
        System.out.println("Capacity of addressString is " + addStringCapacity);
        nameString.setLength(20);
        System.out.println("The name is  " + nameString + "end");
        addressString.setLength(20);
        System.out.println("The address is " + addressString);
    }
}
