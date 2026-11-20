class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int[] row : accounts){
            int total = 0;
            for(int column : row){
                total += column;
            }
            ans = Math.max(total, ans);
        }
        return ans;
    }
}