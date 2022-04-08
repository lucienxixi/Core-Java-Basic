package assignment3.question15;

import java.util.*;

public class Demo {
    public void demo() {
        Solution solution = new Solution();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 10);
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 10);
        List<Integer> result = solution.getList(list, map);
        System.out.println("A list which contains all the elements in list A, but not in map B is shown as follows: ");
        System.out.println(result);
    }
}
