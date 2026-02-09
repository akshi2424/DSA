class Solution {
     public int maxProfit(int[] arr) {
        int n = arr.length;
        int mini = arr[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            int diff = arr[i] - mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, arr[i]);
        }

        return profit;
        
    }
}