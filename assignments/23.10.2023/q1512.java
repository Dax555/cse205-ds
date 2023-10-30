class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int good = 0;

        for(int n : nums){
            if(m.containsKey(n)){
                good+=m.get(n);
                m.put(n,m.get(n)+1);
            }
            else{
                m.put(n,1);
            }
        }

        return good;
    }
}