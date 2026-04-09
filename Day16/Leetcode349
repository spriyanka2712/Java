class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int res[] = new int[set2.size()];
        int i = 0;
        for(int n : set2){
            res[i] = n;
            i++;
        }
        return res;
    }
}