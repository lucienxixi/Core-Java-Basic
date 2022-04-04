package assignment3.question15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public void demo() {
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 10);
        List<Integer> result = solution.getList(list, map);
        System.out.println("A list which contains all the elements in list A, but not in map B is shown as follows: ");
        System.out.println(result);
    }
}
