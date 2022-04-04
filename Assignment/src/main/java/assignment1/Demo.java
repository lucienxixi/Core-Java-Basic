package assignment1;

import java.util.Arrays;

public class Demo {
    public void demo() {
        Solution solution = new Solution();
        solution.getKeyboardInput();
    }

    public void demo1() {
        Solution1 solution1 = new Solution1();
        int[] arr1 = {0,2,4,0,1,4,6,77,4,33};
        int[] arr2 = {10,2,93,84,12,1,34,21,67,22};
        int[] result = solution1.merge(arr1, arr2);
        System.out.println("Merge result: ");
        System.out.println(Arrays.toString(result));
    }

    public void demo2() {
        Solution2 solution2 = new Solution2();
        int[] arr = {10,2,93,84,12,1,34,21,67,22};
        System.out.println("The second largest number in this array is: ");
        int result = solution2.findSecondLargest(arr);
        System.out.println(result);
    }
}
