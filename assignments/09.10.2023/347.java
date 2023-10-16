class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int e  : nums){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }

        int[] freq = new int[max-min+1];

        for(int e : nums){
            freq[e-min]++;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < freq.length; i++){
            if(freq[i]>0){
                ans.add(i+min);
            }
        }

        int[] f = freq;
        int m = min;

        ans.sort((a,b) -> Integer.compare(f[b-m],f[a-m]));

        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = ans.get(i);
        }

        return res;
    }
}