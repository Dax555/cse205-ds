class Solution {
    
    public void sub(List<List<Integer>> ans, int[] nums, List<Integer> out, int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(out));
            return;
        }

        sub(ans, nums, out, i + 1);
        out.add(nums[i]);
        sub(ans, nums, out, i + 1);
        out.remove(out.size() - 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> out = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        sub(ans, nums, out, index);

        
        Set<List<Integer>> set = new HashSet<>(ans);

        
        return new ArrayList<>(set);
    }
}
