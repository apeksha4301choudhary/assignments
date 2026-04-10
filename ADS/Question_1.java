
import java.util.Scanner;

class Question_1{

    public static int fact(int n){
        if(n == 0 || n == 1)
            return  1;
        else
            return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int factorial = fact(num);

        System.out.println("Factorials of " + num + " : " + factorial);

    }
}

// If we are passing negative number then it will be
//StackOverFlowError 

// if we do not want and exception
// then we have to modify our program so the output will also be in - only

// public static int fact(int n){
//         if(n == 0 || n == 1)
//             return  1;
//         else
//             return n * fact(n + 1);
//     }