#include<iostream>

using namespace std;

class Commision{
 private:
    double salesFigure;
    double commisionRate;
    int commisionRate1;

public:
void computeCommision(double sales, double rate){
        double result;
        result = sales  * rate;
        cout << " The result is = " << result << endl;
 }

void computeCommision(double salesFigure, int commisionRate1){
        double initialCommision;
        initialCommision = commisionRate1 / 100.0;

        double totalCommision;
        totalCommision = initialCommision * salesFigure;
        cout << " The total commision is = " << totalCommision << endl;
 }
};

int main(){
  Commision cm;
  cm.computeCommision(11.4, 34.6);
  cm.computeCommision(12.3, 223);
  return 0;
}
