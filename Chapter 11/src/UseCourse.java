import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dept;
        int cred, num;

        CollegeCourse CollegeCor;
        LabCourse LabCor;

        System.out.println("Enter department : ");
        dept = sc.nextLine();

        System.out.println("Enter course number : ");
        num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter credit hours : ");
        cred = sc.nextInt();
        sc.nextLine();

        dept = dept.substring(0, 3).toUpperCase();

        switch(dept){
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                LabCor = new LabCourse(dept,num,cred);
                LabCor.display();
                break;
            default:
                CollegeCor = new CollegeCourse(dept,num,cred);
                CollegeCor.display();
                break;
        }
    }
}
