class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int arr[]= new int[k];
        int n= nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

       for(int i=0;i<n;i++){
           pq.add(i); 
       }

   Set<Integer> set = new HashSet<>();

    for(int i=0;i<k;i++){
        set.add(pq.remove()); 
    }
  int j=0;
    for(int i=0;i<n;i++){
        if(set.contains(i)){
            arr[j]= nums[i];
            j++;
        }
    }
  
  return arr;

    }
}
