class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i==0){
                return 0;
            }
            if(i < 0){
                count += 1;
            }
        }
        return count%2==0?1:-1;
    }
}