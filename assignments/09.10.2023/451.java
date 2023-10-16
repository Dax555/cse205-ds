class Solution {
    public String frequencySort(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int e : s.toCharArray()){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }

        int[] freq = new int[max-min+1];

        for(char e : s.toCharArray()){
            freq[e-min]++;
        }

        List<Character> ans = new ArrayList<>();
        for(int c = min ; c<=max ;c++){
            if(freq[c-min]>0){
                ans.add((char) c);
            }
        }

        int[] f = freq;
        int m = min;

        ans.sort((a,b) -> Integer.compare(f[b-m],f[a-m]));

        char[] res = new char[s.length()];
        int index = 0 ;
        for(char c : ans){
            int f1 = freq[c-min];-
            for( int i = 0 ; i < f1 ; i++){
                res[index++] = c;
            }
        }

        return new String(res);
    }
}