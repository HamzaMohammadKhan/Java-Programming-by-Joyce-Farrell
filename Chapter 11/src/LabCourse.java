public class LabCourse extends CollegeCourse{

    public LabCourse(String nameDep, int couID, int creditHou) {
        super(nameDep, couID, creditHou);
        feeCourse = (creditHou * 120 ) + 50;
    }

    @Override
    public void display() {
        System.out.println("This is the lab course");
        super.display();
    }
}
