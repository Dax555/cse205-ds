class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max_money = 0;

        for(int i = 0 ; i<accounts.length ;i++){
            int money = 0;
            for(int j = 0 ; j<accounts[i].length;j++){
                money+=accounts[i][j];
            }

            max_money = Math.max(max_money,money);

        }
        return max_money;
    }
}