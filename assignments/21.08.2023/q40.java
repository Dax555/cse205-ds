class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
       List<List<Integer>> comb = new ArrayList<>();
       List<Integer> out = new ArrayList<>();
       int i = 0;
        Arrays.sort(nums);
        comSum(nums, comb, i, target, out);
        return comb;
        
}

     public static void comSum(int[] nums,List<List<Integer>> comb,int i,int target,List<Integer> out ){
            
            if(target==0){
                comb.add(new ArrayList<>(out));
                return;
            }

            if(target<0){
                return;
            }    

            for (int j = i; j < nums.length; j++) {

                if(j>i && nums[j]==nums[j-1]){
                    continue;
                }
            out.add(nums[j]);
            comSum(nums, comb, j+1, target - nums[j], out);
            out.remove(out.size() - 1);
        }



        }


}