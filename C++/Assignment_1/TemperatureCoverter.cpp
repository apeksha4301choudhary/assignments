#include <iostream>
using namespace std;

float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);

int main() {
    float Celcius;
    cout<<"Enter the temperature in Celcius : ";
    cin>>Celcius;

    float Fahrenheit;
    cout<<"Enter the temperature in Fahrenheit : ";
    cin>>Celcius;

    float tem_in_Farh = celsiusToFahrenheit(Celcius);
    float tem_in_Cel =  fahrenheitToCelsius(Fahrenheit);

    cout<<"Temprature in Fahrenheit : " <<tem_in_Farh <<endl;
    cout<<"Temprature in Celcius : " <<tem_in_Cel;


}

float celsiusToFahrenheit(float c){
    float F = (c * 9/5) + 32;
    return F;
}

float fahrenheitToCelsius(float f){
    float C = (f - 32) * 5/9;
    return C;
}
