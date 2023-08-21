class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        com(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    public void com(List<List<Integer>> res, List<Integer> curr, int[] candidates, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
           
            if (candidates[i] > remain) {
                continue;
            }

            curr.add(candidates[i]);
           
            com(res, curr, candidates, remain - candidates[i], i);
            curr.remove(curr.size() - 1);
        }
    }
}