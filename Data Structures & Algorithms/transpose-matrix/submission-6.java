class Solution {
    public int[][] transpose(int[][] matrix) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        int[][] ans = new int[COLS][ROWS];

        for(int i=0;i<ROWS;i++){
            for(int j=0;j<COLS;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}