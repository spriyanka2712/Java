class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int lsum = 0;
        for(int i = 0; i < n; i++){
            lsum += nums[i];
            leftSum[i] += lsum;
        }
        int rsum = 0;
        for(int i = n-1; i >= 0; i--){
            rsum += nums[i];
            rightSum[i] += rsum;
        }
        for(int i = 0; i < n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}