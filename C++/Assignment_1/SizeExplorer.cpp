#include <iostream>
using namespace std;

int main() {
    short int a;
    int b;
    long int c;
    long long int d;
    unsigned int e;
    float f;
    double g;
    long double h;
    char i; 
    cout<<"short int : "<<sizeof(a)<<endl;
    cout<<"int : "<<sizeof(b)<<endl;
    cout<<"long int : "<<sizeof(c)<<endl;
    cout<<"long long int : "<<sizeof(d)<<endl;
    cout<<"unsigned int : "<<sizeof(e)<<endl;
    cout<<"float : "<<sizeof(f)<<endl;
    cout<<"double int : "<<sizeof(g)<<endl;
    cout<<"long double int : "<<sizeof(h)<<endl;
    cout<<"char int : "<<sizeof(i)<<endl;
}

/* Which two types have the same size on your machine? Does unsigned int have a dierent size than int?
Ans = int, long int, unsigned int, float have the same size on my machine.
    No, unsigned and int are of same size.
*/
