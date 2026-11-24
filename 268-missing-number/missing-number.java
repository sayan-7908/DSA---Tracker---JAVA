class Solution {
    public int missingNumber(int[] nums) {
        int XOR = nums.length;
        for(int i = 0; i < nums.length; i++){
            XOR ^= i ^ nums[i]; 
        }
        return XOR;
    }
}
// XOR = 3^0^3 => 0
// XOR = 0^1^0 => 1
// XOR = 1^2^1 => 2