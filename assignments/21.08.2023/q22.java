class Solution {
    
    static void gen(String a , int o, int c, List<String> ans, int n){

        if(a.length()==2*n){
            ans.add(a);
            return;
        }

        if(o<n){
             gen(a+"(",o+1,c,ans,n);
        }
        if(c<o){
            gen(a+")",o,c+1,ans,n); 
        }

    }
    
    
    
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        gen("(",1,0,ans,n);
        
        return ans;
    }
}