#include<iostream>

using namespace std;

class Square{
  private:
    int height;
    int width;
    int surfaceArea;
  
  public:
   void computeSurfaceArea(){
       cout << "Enter height : ";
       cin >> height;

       cout << "Enter width : ";
       cin >> width;

       surfaceArea = height*width;
       cout << "The surface area is : " << surfaceArea << endl;
   }
};

class Cube : public Square{
    private : 
    int depth;

    public:
    void computerSurfaceArea(){
        cout << "Enter depth : ";
        cin >> depth;

        int A = 2*depth;
        cout << " The  depth is : " << A << endl;
    } 
};

int main(){
    Square mySquare;
    Cube myCube;

    mySquare.computeSurfaceArea();
    myCube.computerSurfaceArea();
}

