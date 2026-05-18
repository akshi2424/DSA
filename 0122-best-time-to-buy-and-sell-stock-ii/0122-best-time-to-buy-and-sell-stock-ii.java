class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        int ansProfit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]>minPrice){
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
                ansProfit+=maxProfit;
                maxProfit=0;
            }
            minPrice=prices[i];
        }
        return ansProfit;
    }
}