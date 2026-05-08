class Solution {
    public void setZeroes(int[][] matrix) {
        int r= matrix.length;
        int c= matrix[0].length;
        boolean[] rowArr = new boolean[r];
        boolean[] colArr = new boolean[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rowArr[i]=true;
                    colArr[j]=true;
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rowArr[i] || colArr[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
