package assignment1;

// assignment1: question 15

public class Solution2 {
    public int findSecondLargest(int[] nums) {
        if (nums == null) {
            return -1;
        }
        return selectK(nums, 0, nums.length - 1, 2);

    }
    public int selectK(int[] nums, int start, int end, int k) {
        if (start == end) {
            return nums[start];
        }

        int left = start;
        int right = end;
        int pivot = nums[(start + end) / 2];

        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        if(left <= end - k + 1) {
            return selectK(nums, left, end, k);
        }
        if(right >= end - k + 1) {
            return selectK(nums, start, right, k - (end - right));
        }
        return nums[right + 1];
    }
}
