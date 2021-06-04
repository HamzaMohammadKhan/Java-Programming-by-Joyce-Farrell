public class TestShirt {
    public static void main(String[] args){
        Shirt obj1 = new Shirt(12);
        Shirt obj2 = new Shirt(22.3);
        Shirt obj3 = new Shirt(22.5);

        System.out.println(" the first collar size is = " + obj1.getCollarSize() + "\n");
        System.out.println(" the first sleeve length is = " + obj2.getSleeveLength() + "\n" + " the material is = " + obj2.getMaterial() + "\n");
        System.out.println(" the second collar size is = " + obj3.getCollarSize() + "\n");
    }
}
