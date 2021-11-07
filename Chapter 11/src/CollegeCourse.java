public class CollegeCourse {
    private String department;
    private int CourseID;
    private int creditHours;
    private int feeCourse;

    public CollegeCourse(String nameDep, int couID, int creditHou){
        feeCourse = 120;
    }

    public void display(){
        int totalfee = feeCourse * creditHours;
        System.out.println(" The department is " + department);
        System.out.println(" The courseID is " + CourseID);
        System.out.println(" The credit hours are  " + creditHours);
        System.out.println( " The total credit hours are " + totalfee);
    }
}
