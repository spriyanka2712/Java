class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd =0;
        for(int i:position){
            if(i%2==0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        return Math.min(even, odd);
    }
}