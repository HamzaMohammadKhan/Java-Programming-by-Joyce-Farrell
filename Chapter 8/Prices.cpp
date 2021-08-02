#include<iostream>

using namespace std;

int main(){
    double Prices[] = {2.39, 7.89, 1.34, 3.22, 4.22, 7.00, 23.33, 90.8, 2.99, 1.55, 2.55, 4.54, 3.66, 1.21, 4.44, 7.909, 1.33, 5.33, 6.99, 0.99};
    int arrSize = sizeof(Prices)/sizeof(Prices[0]);
    cout << "The size of the array is : " << arrSize << endl;
    //1
    
    double n=20, sum=0;
    for(int x=0; x<n ;x++){
       sum += Prices[x];
    }
    cout << "The sum is : " << sum << endl;

    //2
    cout << "\n" << "The values below 5 are : "<<endl;
    for(double y : Prices){
        if(y<5){
            cout<< y << endl;
        }
    }
    
    //3
    double avg;
    cout << "\n" << "The avg is : " << endl;
    for(double z : Prices){
        avg = sum/20;     
    }
    cout << avg << endl;

    //4
    cout<<"\n" << "The values below avg are : " << endl;
    for(double m : Prices){
        if(m<avg){
            cout<<m<<endl;
        }
    }
    //5
    cout << "\n" << "The values that are higher than avg are : " << endl;
    for(double r : Prices){
        if(r>avg){
            cout << r << endl;
        }
    }

}