class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        // Only search for the last position if the target exists at all
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // position = true  -> find first occurrence
    // position = false -> find last occurrence
    int search(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;               // record a match, then keep looking
                if (findFirst) {
                    end = mid - 1;       // look further left
                } else {
                    start = mid + 1;     // look further right
                }
            }
        }
        return ans;
    }
}