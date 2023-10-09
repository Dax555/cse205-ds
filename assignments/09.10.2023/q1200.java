class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        mergeSort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            int diff = arr[i+1]-arr[i];
            if(diff<min)
            {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(diff==min)
            {
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        
        return res;
    }
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return; 
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}