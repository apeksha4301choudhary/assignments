package com.assignment_2;


class ScopeDemonstrationProgram {

    int instancevar = 5; //instance variable
    static int staticVar = 2; //static variable

    public static void LocalVar() {
        int localVar = 3; //local variable inside parametr
    }

    public static void main(String[] args) {
        ScopeDemonstrationProgram t = new ScopeDemonstrationProgram();

        //  System.out.println("Instance variable : " + instanceVar);
        /*
            error: cannot find symbol
            System.out.println("Instance variable : " + instanceVar);
                                                    ^
            symbol:   variable instanceVar
            location: class Test

            when we access an instance variable without any object refrence 
            then we will get above error
         */
        //System.out.println("Local variable : " + LocalVar);
        /*
             error: cannot find symbol
            System.out.println("Local variable : " + LocalVar);
                                                 ^
            symbol:   variable LocalVar
            location: class Test

            we cannot access a local variable outside its block otherwise we
            will gwt compiletime error
            bcz its cope is only within those blocks or methods in which
            it is declared
         */

    }
}

