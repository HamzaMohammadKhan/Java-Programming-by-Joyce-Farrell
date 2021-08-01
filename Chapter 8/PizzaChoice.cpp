#include<iostream>
#include<string>

using namespace std;

int main(){
    static int NUMBER_OF_CHOICES = 5;
    string PizzaSize[] = {"N", "S", "M", "L", "X"};
    double  PizzaPrice[] = {0.0, 6.99, 8.99, 12.50, 15.00};

    double price = 0.0;
    bool validChoice = false;
    string sizeChoosen;
    cout << "Enter choice : " << endl;
    cin >> sizeChoosen;

    for(int x = 0; x < NUMBER_OF_CHOICES; ++x){
        if(sizeChoosen == PizzaSize[x]){
            validChoice = true;
            price = PizzaPrice[x];
        }
        if(validChoice){
            cout << " Your size is " << sizeChoosen << " and your price " << price << endl;
        }
        else{
            cout << " wrong choice " << endl;
        }
    }
}