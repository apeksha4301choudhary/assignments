#include <iostream>
using namespace std;

int absolute(int n); //returns the absolute value of n.
int clamp(int val, int lo, int hi);

int main() {

    cout<<"val\t"<<"lo\t"<<"hi\t"<<"absolute(val)\t"<<"clamp(val, lo, hi)\t"<<endl;

    cout<<"-------------------------------------------------------------------------"<<endl;

    cout<<"-15\t"<<"-10\t"<<"10\t";
    cout<<absolute(-15)<<"\t\t";
    cout<<clamp(-15,-10,10 )<<endl;

    cout<<"-------------------------------------------------------------------------"<<endl;

    cout<<"0\t"<<"-10\t"<<"10\t";
    cout<<absolute(0)<<"\t\t";
    cout<<clamp(0,-10,10 )<<endl;

    cout<<"-------------------------------------------------------------------------"<<endl;

    cout<<"25\t"<<"-10\t"<<"10\t";
    cout<<absolute(25)<<"\t\t";
    cout<<clamp(25,-10,10 )<<endl;

    cout<<"-------------------------------------------------------------------------"<<endl;

    cout<<"-3\t"<<"0\t"<<"5\t";
    cout<<absolute(-3)<<"\t\t";
    cout<<clamp(-3,0,5 )<<endl;
}

int absolute(int n){
    
    return (n<0) ? -n : n;
}

int clamp(int val, int lo, int hi){ 
    return  (val<lo) ? lo : (val>hi) ? hi : val; 
}


