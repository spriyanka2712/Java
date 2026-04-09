class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int majority = 0;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                majority = key;
            }
        }
        return majority;
    }
}