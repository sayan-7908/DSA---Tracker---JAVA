class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;

        int start = 0, end = nums.length - 1;
        boolean isAscending = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}