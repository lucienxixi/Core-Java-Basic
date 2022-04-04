package assignment1;

public class Driver {
    public static void main(String[] args) {
        Demo demoObj = new Demo();
        System.out.println("Question 13:");
        demoObj.demo();

        System.out.println("Question 14:");
        demoObj.demo1();

        System.out.println("Question 15:");
        demoObj.demo2();
    }
}

/*
demo console output ：
Question 13:
Please enter a number which is greater than 0, and if you want to quit please enter q:
1
sum of 1 to 1:
1
Please enter a number which is greater than 0, and if you want to quit please enter q:
10
sum of 1 to 10:
55
Please enter a number which is greater than 0, and if you want to quit please enter q:
-20
Error! The number should be greater than 0!
Please enter a number which is greater than 0, and if you want to quit please enter q:
e
'e' is ILLEGAL String representation of an integer
java.lang.NumberFormatException: For input string: "e"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at assignment1.Solution.getKeyboardInput(Solution.java:22)
	at assignment1.Demo.demo(Demo.java:6)
	at assignment1.Driver.main(Driver.java:6)
Please enter a number which is greater than 0, and if you want to quit please enter q:
q
Quit!

Process finished with exit code 0
*/

/*
demo1 console output ：
Question 14:
Merge result:
[0, 0, 1, 1, 2, 2, 4, 4, 4, 6, 10, 12, 21, 22, 33, 34, 67, 77, 84, 93]
*/

/*
demo2 console output ：
Question 15:
The second largest number in this array is:
84
*/