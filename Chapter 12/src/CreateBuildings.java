public class CreateBuildings {
    public static void main(String[] args){
        House obj1 = new House();
        School obj2 = new School();

        obj1.setBaths(12);
        obj1.setSquareFootage(123);
        obj1.setStories(21);
        obj1.setNumberOfBedrooms(3);

        System.out.println("the baths : " + obj1.getBaths());
        System.out.println("the square footage : " + obj1.getSquareFootage());
        System.out.println("the stories : " + obj1.getStories());
        System.out.println("the numbers of bedrooms : " + obj1.getNumberOfBedrooms());
    }
}
