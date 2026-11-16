class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = x;
        long ans = 0;
        while(num != 0){
            int r = num % 10;
            ans = ans * 10 + r;
            num /= 10; 
        }
        return (ans == x);
    }
}