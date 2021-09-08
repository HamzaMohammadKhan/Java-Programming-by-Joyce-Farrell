public class DemoBook {
    public static void main(String[] args){
        TextBook tbook = new TextBook();

        tbook.setTitle("The C++");
        tbook.setNumberOfPages(280);
        tbook.setGradeLevel(4);

        tbook.displayAll();
        tbook.displayGrade();
    }

}
