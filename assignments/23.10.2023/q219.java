class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++ ){
            if(m.containsKey(nums[i]) && Math.abs(m.get(nums[i])-i)<=k){
                return true;
            }
            m.put(nums[i],i);
        }

        return false;
    }
}