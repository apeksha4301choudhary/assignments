#include <iostream>
using namespace std;

// -------call by value------
/*void doubleIt(int n)
{
    n = n * 2;
    cout << "Inside doubleIt: " << n << endl;
}

int main()
{
    int num = 7;
    doubleIt(num);
    cout<<"In main after call: "<<num<<endl;;
}
    // output : Inside doubleIt: 14
                In main after call: 7
*/

//-------Call by Reference --------

void doubleIt(int &n)
{
    n = n * 2;
    cout << "Inside doubleIt: " << n << endl;
}

int main()
{
    int num = 7;
    doubleIt(num);
    cout<<"In main after call: "<<num<<endl;;
}
 // OUTPUT : Inside doubleIt: 14
//           In main after call: 7