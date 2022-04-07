package lambda_and_stream_assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    /*
    1)	Given a list of Objects, write a method that returns a list of all strings that start with the letter 'a' (lower case)
        and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams APIs.

    public List<String> search(List<Peron> list) {//new Person(name, age, sex)
        //write the stream logic hear
    }
     */

    public List<String> search(List<Person> list) {
        return list.stream()
                .map(e -> e.toString().split(", "))
                .flatMap(e -> Arrays.stream(e))
                .filter(e -> e.length() == 3 && e.charAt(0) == 'a')
                .collect(Collectors.toList());
    }
    

    /*
    2)	Write a method that returns a comma separated string based on a given list of integers. Each element should be preceded
        by the letter 'e' if the number is even, preceded by the letter 'o' if the number is odd. For example, if the input list
        is (3,44), the output should be 'o3,e44'.

    public String getString(List<Integer> list) {
        //Write the stream logic hear
    }
     */

    public String getString(List<Integer> list) {
        return list.stream()
                .map(n -> {
                    String s;
                    if (n % 2 == 0) {
                        s = "e" + n;
                    } else {
                        s = "o" + n;
                    }
                    return s;
                })
                .collect(Collectors.toList()).toString();
    }

    /*
    3)	Write a method that returns the average of a list of integers.

    public Double average(List<Integer> list) {
        //write the stream logic hear
    }
     */

    public Double average(List<Integer> list) {
        return list.stream().mapToDouble(n -> n).sum() / list.size();
    }


    /*
    4)	Write a method that converts all strings in a list to their upper case.

    public List<String> upperCase(List<String> list) {
        //write the stream logic hear
    }
     */

    public List<String> upperCase(List<String> list) {
        return list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
    }
}
