class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        int dup = 0, miss = 0;

        for(int i : nums){
            if(s.contains(i)){
                dup = i;
            }
            s.add(i);
        }

        for(int i = 1 ; i  <= n ; i++){
            if(!s.contains(i)){
                miss = i;
            }
        }

        return new int[] {dup,miss};
    }
}