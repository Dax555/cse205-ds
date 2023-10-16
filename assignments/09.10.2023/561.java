class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         int pos = 0;

        for(int i = 0 ; i < arr2.length ; i++){
            for(int j = pos ; j < arr1.length ; j++){
                if(arr2[i] == arr1[j]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[pos];
                    arr1[pos] = tmp;
                    pos++;
                }
            }
        }

        int n = pos;
        int[] arr = new int[arr1.length - pos];
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr1[pos];
            pos++;
        }

        mergeSort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            arr1[n] = arr[i];
            n++;
        }

        return arr1;
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