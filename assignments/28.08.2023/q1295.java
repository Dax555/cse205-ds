class Solution {
    public int findNumbers(int[] nums) {
        int count =0;

        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            int sum = 0;

            while(x>0){
                int r = x%10;
                sum++;
                x = x/10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}