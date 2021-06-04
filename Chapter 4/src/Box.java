public class Box {
    private int length;
    private int width;
    private int heigth;

    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    int getHeigth(){
        return heigth;
    }

    Box(int length){
        this.length = length;
        System.out.println("Line created");
    }
    Box(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println("Rectangle created");
    }
    Box(int length, int width, int heigth){
     this.length = length;
     this.heigth = heigth;
     this.width = width;
     System.out.println("Box created");
    }

}
