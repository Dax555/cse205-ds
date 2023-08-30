class q118 {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> out = new ArrayList<>();

        if (numRows <= 0) return out;

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            if (i == 0) {
                curr.add(1);
            } else {
                List<Integer> prev = out.get(i - 1);
                curr.add(1);
                for (int j = 1; j < i; j++) {
                    curr.add(prev.get(j - 1) + prev.get(j));
                }
                curr.add(1);
            }
            out.add(curr);
        }

        return out;




    }
}