class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;   // nums[0] always unique, tai 1 theke shuru

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}