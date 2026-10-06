class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean ans = true;
        for(int i = 0 ; i <= row -2 ; i++){
            for(int j = 0 ; j <= column-2 ; j++){
                if(matrix[i][j] == matrix[i+1][j+1]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
    return ans;
    }
}