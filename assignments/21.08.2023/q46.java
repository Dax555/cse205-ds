class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        per(nums, new ArrayList<>(), res);
        return res;
    }

    void per(int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int number :nums){
            if(!curr.contains(number)){
                curr.add(number);
                per(nums, curr, res);
                curr.remove(curr.size()-1);
            }
        }
    }

    
}