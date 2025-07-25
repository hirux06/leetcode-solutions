class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int n = row;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j< row/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
}