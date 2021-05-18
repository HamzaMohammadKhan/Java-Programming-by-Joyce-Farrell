public class TestCircle {
    public static void main(String[] args){
        //small radius
        Circle ObjS = new Circle();
        //large radius
        Circle ObjL = new Circle();

        ObjL.ComputeArea(12);
        ObjL.ComputeDiameter(11);

        ObjS.ComputeDiameter(2);
        ObjS.ComputeArea(3);
    }
}
