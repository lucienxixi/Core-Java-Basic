package assignment4.question15;

public class Calculator {

    public static String calculate(String string) {
        String[] array = string.split(" ");
        int result = Integer.parseInt(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals("-") && !array[i].equals("+")) {
                int number = Integer.parseInt(array[i]);
                if (array[i - 1].equals("+")) {
                    result += number;
                } else {
                    result -= number;
                }
            }
        }

        return string + " = " + result;
    }
}
