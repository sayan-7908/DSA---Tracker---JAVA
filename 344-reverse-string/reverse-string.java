class Solution {
    public void reverseString(char[] s) {
        int L = s.length;
        for (int i = 0; i < L/2; i++) {
            char temp = s[i];
            s[i] = s[L-1-i];
            s[L-1-i] = temp;
        }
    }
}