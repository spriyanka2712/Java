class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        int row = accounts.length;
        int col = accounts[0].length;
        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < col; j++){
                sum += accounts[i][j];
            }
            if(sum > richest){
                richest = sum;
            } 
        }
        return richest;
    }
}