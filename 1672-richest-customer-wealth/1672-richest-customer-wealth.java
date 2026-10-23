class Solution {
    public int maximumWealth(int[][] accounts) {
        int col = accounts[0].length;
        int row = accounts.length;
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                sum += accounts[i][j]; 
            }
            if(sum > max){
                max = sum;
            }
            sum = 0;  
        }
    return max;
    }
}