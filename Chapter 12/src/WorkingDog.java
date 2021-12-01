public class WorkingDog extends Dog implements Dog.Worker {
    private int hoursOfTraining;
    public void setHoursOfTraining(int hrs){
        hoursOfTraining = hrs;
    }
    public int getHoursOfTraining(){
        return hoursOfTraining;
    }
    public void work(){
        speak();
        System.out.println("i am dog who works");
        System.out.println("I have " + hoursOfTraining + " hours of professinal training ");
    }
}
