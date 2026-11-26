class Solution {
    public int countPrimes(int n) { 
        if(n <= 2) return 0;
        byte[] b = new byte[n];
        int ans = n - 2;
        for(int i = 2; i * i < n; i++){
            if(b[i] == 0){
                for(int j = i * i; j < n; j += i){
                    if(b[j] == 0){
                        b[j] = 1;
                        ans--;
                    }
                }
            }
        }
        return ans;
    }
}