class Solution {
    static int findNumbers(int[] nums) {
            if(nums.length < 1) return 0;
            int ans = 0, count = 0;

            for(int i=0;i<nums.length;i++){
                int element = nums[i];
                while(element > 0){
                    element = element /10;
                    count++;
                }
                if(count % 2 == 0){
                    ans += 1;
                }
                count = 0;
            }
            return ans;

        }
}