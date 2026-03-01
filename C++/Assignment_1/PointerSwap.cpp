#include <iostream>
using namespace std;
void swap(int *px, int *py, int *pz){
    int temp;
    temp = *px;
    *px = *py;
    *py = *pz;
    *pz = temp;

}

int main() {
    int a, b, c;
    cout<<"Enter three numbers : "<<endl;
    cin>>a;
    cin>>b;
    cin>>c;

    cout<<"Value of a : "<<a<<" b : "<<b<<" c : "<<c<<endl;

    swap(&a, &b, &c);

    cout<<"After Swapping Value of a : "<<a<<" b : "<<b<<" c : "<<c<<endl;
}