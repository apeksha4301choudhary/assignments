#include <iostream>
#include <iomanip>
using namespace std;

const float PI = 3.14159f;

float circleArea(float radius); //returns area of a circle.
float circlePerimeter(float radius); //returns circumference

int main() {
    float radius = 7.0;
    //PI = 3.0f; // attempt to modify const

    circleArea(radius);// returns area of a circle.
    circlePerimeter(radius); //returns circumference

    cout<<fixed<<setprecision(4);
    cout<<"Area of Circle : "<<circleArea(radius)<<endl;
    cout<<"Perimeter of Circle : "<<circlePerimeter(radius);

}

float circleArea(float radius){
    float area = PI * radius * radius;
    return area;
}


float circlePerimeter(float radius){
    float perimeter = 2 * PI * radius;
    return perimeter;
}

// -----------Error! after reassigning PI-------
/*
    error: assignment of read-only variable 'PI'
     PI = 3.0f;
          ^~~~
*/