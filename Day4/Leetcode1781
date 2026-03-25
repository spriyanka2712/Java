class Solution {
    public int beautySum(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            int freq[] = new int[26];
            for(int j = i; j < s.length(); j++){
                freq[s.charAt(j)-'a']++;
                int min = Integer.MAX_VALUE;
                int max = 0;
                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        min = Math.min(freq[k], min);
                        max = Math.max(freq[k], max);
                    }
                }
                res += (max-min);
            }
        }
        return res;
    }
}