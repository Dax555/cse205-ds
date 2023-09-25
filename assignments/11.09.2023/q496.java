class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[nums2.length];

        Arrays.fill(nextGreater, -1);

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int idx = stack.pop();
                nextGreater[idx] = nums2[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    indexInNums2 = j;
                    break;
                }
            }
            if (indexInNums2 != -1) {
                result[i] = nextGreater[indexInNums2];
            }
        }

        return result;
    }
}