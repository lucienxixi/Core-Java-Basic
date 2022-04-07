package lambda_and_stream_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public void demo1() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("peter", 18, "male"));
        list.add(new Person("michael", 26, "male"));
        list.add(new Person("ann", 23, "female"));
        list.add(new Person("amy", 25, "female"));
        System.out.println("input list: ");
        System.out.println(list);

        Solution solution = new Solution();
        System.out.println("output list: ");
        System.out.println(solution.search(list));
        System.out.println();
    }

    public void demo2() {
        List<Integer> list = Arrays.asList(11, 32, 53, 14, 25, 36, 72, 81);
        System.out.println("input list: ");
        System.out.println(list);

        Solution solution = new Solution();
        System.out.println("output list: ");
        System.out.println(solution.getString(list));
        System.out.println();
    }

    public void demo3() {
        List<Integer> list = Arrays.asList(22, 21, 43, 56, 76, 88, 91, 12);
        System.out.println("input list: ");
        System.out.println(list);

        Solution solution = new Solution();
        System.out.println("output list: ");
        System.out.println(solution.average(list));
        System.out.println();
    }

    public void demo4() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "melon");
        System.out.println("input list: ");
        System.out.println(list);

        Solution solution = new Solution();
        System.out.println("output list: ");
        System.out.println(solution.upperCase(list));
        System.out.println();
    }
}
