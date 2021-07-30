public class DemoArray3 {
    public static void main(String[] args){
        double[] salary = {6.25, 6.55, 10.25, 16.85};

        System.out.println("PRint Salary one by one");
        System.out.println(salary[0]);
        System.out.println(salary[1]);
        System.out.println(salary[2]);
        System.out.println(salary[3]+"\n");


        for(int x=0; x<salary.length;++x){
            System.out.println(salary[x]);
        }
    }
}
