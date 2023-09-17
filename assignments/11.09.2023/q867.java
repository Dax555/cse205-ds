class Solution {
    public int[][] transpose(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] new_a = new int[cols][rows];

        for(int i = 0 ; i<rows;i++){
            for(int j = 0 ; j<cols ; j++){
                new_a[j][i] = a[i][j];
            }
        }

        return new_a ;
    }
}