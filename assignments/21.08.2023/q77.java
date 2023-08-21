class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        com(1, n, k ,curr, result);
        return result;
    }


    public void com(int start, int n , int k , List<Integer> curr , List<List<Integer>> res){

        if(curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i =start; i<=n; i++){
            curr.add(i);
            com(i+1, n, k,curr, res);
            curr.remove(curr.size()-1);
        }


    }
}