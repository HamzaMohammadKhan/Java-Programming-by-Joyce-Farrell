public class DemoWorkingDogs {
    public static void main(String[] args){
        WorkingDog aSheepHerder= new WorkingDog();
        WorkingDog aSeeingEyeDog = new WorkingDog();
        aSheepHerder.setNameOfAnimal("Simon, the border collide");
        aSeeingEyeDog.setNameOfAnimal("Sophie , the border collide");

        aSheepHerder.setHoursOfTraining(40);
        aSeeingEyeDog.setHoursOfTraining(300);

        System.out.println(aSheepHerder.getAnimalName() + " says ");
        aSheepHerder.speak();
        aSheepHerder.work();
        System.out.println(); //prints blank line for readability

        System.out.println(aSeeingEyeDog.getAnimalName() + " says ");
        aSeeingEyeDog.speak();
        aSeeingEyeDog.work();
    }
}
