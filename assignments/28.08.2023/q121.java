class q121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        
        if(prices.length==0){   //No element in array no profit made.
            return 0;
        }

        for(int i = 0;i<prices.length;i++){
            if(prices[i]<buy){ 
                buy=prices[i];
            }
            else{
                int temp_profit=prices[i]-buy;
                if(temp_profit>profit){
                    profit=temp_profit;
                }
            }
        }
        return profit;
    }
}