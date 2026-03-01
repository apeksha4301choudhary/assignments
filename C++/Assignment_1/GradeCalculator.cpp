#include <iostream>
using namespace std;

int main() {
    float mathematics, physics, chemistry, hindi, english;
    cout<<"Enter your marks below : "<<endl;
    cout<<"Mathematics : ";
    cin>>mathematics;

    cout<<"Physics : "<<endl;
    cin>>physics;

    cout<<"Chemistry : "<<endl;
    cin>>chemistry;

    cout<<"Hindi : "<<endl;
    cin>>hindi;

    cout<<"English : "<< endl;
    cin>>english;

    float total = mathematics + physics + chemistry + hindi + english;
    cout<<"Total : "<< total;

    float percentage = total / 5;
    cout<<"Percentage : " << percentage << endl;

    string grade = (percentage >= 75) ? "A":
                    (percentage >= 60) ? "B":
                    (percentage >= 45) ? "C": "Fail";
                
    cout<< "Greade : " <<grade;

}