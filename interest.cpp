#include<iostream>

using namespace std;

int interest(int a, double b){
 int result = a * b;
 cout << " Your total price is =  " << result << endl;
 return a,b;
}

int main()
{
 int invest = 1000;
 double interest_invest = 0.05;
 cout << "\t\t\t\t INVSESTMENT " << endl;
 interest(invest, interest_invest);
 return 0;
}
