package assignment1;

import java.util.Scanner;


// assignment1: question 13
public class Solution {
    public void getKeyboardInput() {
        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number which is greater than 0, and if you want to quit please enter q: ");
            String input = scan.next();

            if (input.equals("q")) {
                System.out.println("Quit!");
                break;
            } else {
                int number = 0;

                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.err.println("'"+ input + "' is ILLEGAL String representation of an integer");
                    e.printStackTrace();
                    continue;
                }

                if (number > 0) {
                    doSomething(number);
                } else {
                    System.err.println("Error! The number should be greater than 0!");
                }
            }
        }
    }

    public void doSomething(int number) {
        System.out.println("sum of 1 to " + number + ": ");
        int sum = 0;
        for (int i = 1; i < number + 1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
