import java.util.Optional;

public class UseAnimals {
    public static void main(String[] args){
        Dog myDog = new Dog();
        Cow myCow = new Cow();
        Snake mySnake = new Snake();
        myDog.setNameOfAnimal("My dog is murph");
        myCow.setNameOfAnimal("My cow is Els");
        mySnake.setNameOfAnimal("My snake name is se");
        System.out.println(myDog.getAnimalName() + " says ");
        myDog.speak();
        System.out.println(myCow.getAnimalName()+ " Says ");
        myCow.speak();
        System.out.println(mySnake.getAnimalName()+ " says ");
        mySnake.speak();
    }
}
