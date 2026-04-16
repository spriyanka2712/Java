class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        String words[] = paragraph.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        String result = "";
        for(String s : words){
            if(!set.contains(s) && s.length() > 0){
                map.put(s, map.getOrDefault(s, 0)+1);
                if(map.get(s) > max){
                    max = map.get(s);
                    result = s;
                }
            }
        }
        return result;
    }
}