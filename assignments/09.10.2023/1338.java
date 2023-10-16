class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int e : arr){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }

        int[] freq = new int[max-min+1];

        for(int e : arr){
            freq[e-min]++;
        }

        mergeSort(freq);
        int i = max-min;
        int count = 0;

        while(n>arr.length/2){
            n-=freq[i];
            i--;
            count++;
        }

        return count;
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