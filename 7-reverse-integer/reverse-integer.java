class Solution {
    public int reverse(int x) {
        int num = Math.abs(x); // we don't use "long" data type because "Assume the environment does not allow you to store 64-bit integers (signed or unsigned)." using "long" this problem is Possible to solve but IYKYK....
        int ans = 0;
        while(num != 0){
            int rev = num % 10;
            if(ans > (Integer.MAX_VALUE - rev) / 10) return 0;
            ans = ans * 10 + rev;
            num /= 10;
        }
        return (x < 0)? (-ans) : ans; 
    }
}