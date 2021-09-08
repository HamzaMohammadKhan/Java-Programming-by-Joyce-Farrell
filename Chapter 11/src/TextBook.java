public class TextBook extends Book{
    private int gradeLevel;

    public int getGradeLevel(){
        return gradeLevel;
    }
    public void setGradeLevel(int g){
        gradeLevel = g;
    }
    public void displayGrade(){
        System.out.println("Your grade is : " + gradeLevel);
    }
}
