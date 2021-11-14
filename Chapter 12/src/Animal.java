public abstract class Animal {
    private String nameOfAnimal;
    public abstract void speak();

    public String getAnimalName(){
        return nameOfAnimal;
    }
    public void setNameOfAnimal(String name){
        nameOfAnimal = name;
    }
}
