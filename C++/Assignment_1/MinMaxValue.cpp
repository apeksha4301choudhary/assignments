#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &minVal, int &maxVal);

int main() {
    int a, b, c;
    int lo, hi;

    cout<<"Enter three values : "<<endl;
    cin>>a>>b>>c;

    findMinMax(a, b, c, lo, hi);
    cout<<"Minimum Value : "<<lo<<endl;
    cout<<"Maximum Value : "<<hi<<endl;
}

void findMinMax(int a, int b, int c, int &minVal, int &maxVal){
    minVal = a;
    maxVal = a;

    if(b > maxVal){
        maxVal = b;
    }
    if(c > maxVal){
        maxVal = c;
    }

    if(b < minVal){
        minVal = b;
    }
    if(c < minVal){
        minVal = c;
    }
}