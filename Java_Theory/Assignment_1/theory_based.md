1\. What is Java?

Ans = 	“Java is a high-level, object-oriented, platform-independent language. It follows WORA (Write Once Run Anywhere) using JVM, which executes bytecode and converts it into machine code. 	Java is widely used in real-world applications like banking systems, web applications, Android apps, and enterprise software due to its security, scalability, and robustness.”

&#x09;

&#x09;Java was Developed by **James Gosling in Sun Microsystems, 1995.**

&#x09;Main goal is to remove complexity of C/C++, to Provide platform independence and to improve security and portability.

\----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



&#x09;/\* **Core Features of java are**

&#x09;It is platform independent, object-oriented, simple, secure, robust, multithreaded and high in performance.



&#x09;1. It is Platform Independent because Java code runs on any OS Because of JVM (Java Virtual Machine).

&#x09;2. Object-Oriented because Everything is based on classes and objects , OOP concepts like Encapsulation, Inheritance, Polymorphism ,Abstraction

&#x09;3. Simple because there are No pointers and we can access direct , Automatic memory management by Garbage Collector.

&#x09;4. Secure because there is No pointer manipulation, there is Bytecode verification and it Runs inside JVM sandbox

&#x09;5. It is Robust because there is Strong memory management and Exception handling

&#x09;6. Multithreaded and Can execute multiple tasks simultaneously

&#x09;7. High in Performance Uses JIT (Just-In-Time Compiler).\*/

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



2\. Is Java platform dependent or independent?

Ans = 	Java is platform-independent because of bytecode, but JVM is platform-dependent as it is OS-specific. Thus, Java achieves portability through JVMs on different systems.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

3\. What is JVM?

Ans = 	The Java Virtual Machine (JVM) is a core component of the Java Runtime Environment (JRE) that allows Java programs to run on any platform without modification. JVM acts as an 	interpreter between Java bytecode and the underlying hardware,

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

4\. What is JDK and JRE?

Ans = 	JDK

&#x09;JDK stands for Java Development Kit. It is a complete software development environment used to develop, compile, debug, and run Java applications.

&#x09;The JDK includes:

&#x09;	Java compiler (javac)

&#x09;	Java launcher (java)

&#x09;	Debugger, documentation tools, and other utilities

&#x09;	Java Runtime Environment (JRE)

&#x09;JRE

&#x09;	JRE stands for Java Runtime Environment. It provides the runtime environment required to execute Java programs. It does not include development tools such as compilers or 		debuggers.The JRE consists of:

&#x09;		Java Virtual Machine (JVM)

&#x09;		Core Java class libraries

&#x09;		Supporting files required for program execution

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

5\. Why is Java called “Write Once, Run Anywhere”?

Ans =	Java is called Write Once, Run Anywhere because its compiled bytecode runs on any system using JVM, without requiring code changes.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

6\. What is a class in Java?

Ans =	A class is a blueprint used to create objects, containing variables and methods that define the properties and behavior of those objects.”

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

7\. What is an object?

Ans =	An object is an instance of a class that holds real data and can perform operations defined by the class.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

8\. What is the main method in Java?

Ans =	Java's main() method is the starting point from where the JVM starts the execution of a Java program. JVM will not execute the code if the program is missing the main method. 	Hence, it is one of the most important methods of Java

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

9\. What is the use of System.out.println()?

Ans =	System.out.println() in Java is one of the most commonly used statements to display output on the console. It prints the given data and then moves the cursor to the next line, 	making it ideal for readable output.

&#x09;**System**: System is a final class present in the java.lang package. It provides access to system-related resources such as input, output, and error streams.

&#x09;**out**: out is a public static object of type PrintStream defined inside the System class. It represents the standard output stream, usually the console.

&#x09;**println()**: println() is a method of the PrintStream class. It prints the specified value and then adds a new line at the end of the output. It is an enhanced version of print().



\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

11\. What are data types in Java?

Ans = 	Data types in Java define the kind of data a variable can hold and the memory required to store it. They are broadly divided into two categories:

&#x09;Primitive Data Types: Store simple values directly in memory.

&#x09;Non-Primitive (Reference) Data Types: Store memory references to objects.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

12\. Give examples of primitive data types.

Ans = byte, short,int, long, float, double, char and Boolean all there are primitive datatype.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

13\. What is a variable?

Ans =	A variable is a container used to store data values in a program.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

14\. How do you declare a variable in Java?

Ans =	Variable Declaration means telling the compiler about the variable’s name and data type.

&#x09;syntax : datatype variable\_name;

&#x09;ex : int age;

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

15\. What is the difference between int and float?

Ans = 	int is a integral data type and float is a floating point datatype.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

16\. What is type casting?

Ans =	Type casting is the process of converting one data type into another. It can be implicit, where Java automatically converts smaller types to larger types, or explicit, where the 	programmer manually converts larger types to smaller types.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

17\. What is the default value of int?

Ans =	the default value of int is 0;

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

18\. What is a keyword in Java?

Ans =	A keyword in Java is a reserved word that has a predefined meaning and cannot be used as an identifier (like variable, class, or method name).

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

19\. Can we use reserved keywords as variable names?

Ans =	No, we cant use reserved keywords as variable name because keyword in Java is a reserved word that has a predefined meaning and cannot be used as an identifier (like variable, 	class, or method name).

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

20\. What is the difference between = and ==?

Ans =	= is used for assignment and == is used for equality check.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

21\. What is an if statement?

Ans =	An if statement is a conditional statement used to execute a block of code only if a specified condition is true.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

22\. Difference between if and switch?

Ans =	The if statement evaluates boolean conditions and is suitable for complex logic, while the switch statement compares a single expression against fixed constant values, making it 	more structured for multiple discrete options.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

23\. What is a loop?

Ans =	A loop is a control structure used to repeatedly execute a block of code as long as a given condition is true. It helps reduce code redundancy and is commonly used for iteration.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

24\. Types of loops in Java?

Ans =	Java has three types of loops: for, while, and do-while. The for loop is used when the number of iterations is known, while loop when it is unknown, and do-while ensures the code 	executes at least once.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

25\. Difference between for loop and while loop?

Ans =	The for loop is used when the number of iterations is known, while loop when it is unknown.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

26\. What is break statement?

Ans =	The break statement is used to terminate a loop or switch statement immediately and transfer control to the next statement. It is commonly used to stop execution when a condition 	is met.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

27\. What is continue statement?

Ans =	The continue statement is used to skip the current iteration of a loop and continue with the next iteration. It is useful when certain conditions need to be ignored without 	stopping the loop.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

28\. What will happen if we don’t write the main method?

Ans =	If the main method is not written, the Java program will compile but will not execute because JVM requires the main method as the entry point to start execution.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

29\. Can we run a Java program without class?

Ans =	No, a Java program cannot run without a class because Java is a class-based language. All code must be defined inside a class, and execution starts from the main method within that 	class.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

30\. What happens if we don’t compile a Java program?

Ans =	If a Java program is not compiled, it cannot be executed because the JVM can only run bytecode, not source code. Compilation is required to convert the .java file into a .class 	file.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

31\. Can a variable change its data type?

Ans =	No, a variable cannot change its data type in Java because it is strongly typed. Once declared, the variable can only store values of that specific type, though type casting can be 	used to convert values when needed.

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

32\. What is the size of int in Java?

Ans = The size of int in java is 4 bytes which is 32 bits;

\--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

33\. Why Java does not support pointers directly? 	

Ans = 	Java does not support pointers directly to enhance security and simplicity. Direct memory access is restricted, and instead Java uses references along with garbage collection to manage memory safely.

