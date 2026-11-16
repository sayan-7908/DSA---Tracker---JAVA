class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, i = 2;
        while(i <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }
        return b;
    }
}