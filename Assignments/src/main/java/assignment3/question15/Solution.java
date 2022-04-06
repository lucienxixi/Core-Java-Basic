package assignment3.question15;

import java.util.*;

public class Solution {
    public List<Integer> getList(List<Integer> list, Map<String, Integer> map) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> valueSet = new HashSet<>(map.values());

        for (int element : list) {
            if (!valueSet.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
