class Solution {
    public int findMaxConsecutiveOnes(int[] malav) {
        int count = 0;
        int maxCount = 0;
        
        for (int i = 0; i < malav.length; i++) {
            if (malav[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}