class Solution {
    public String reverseWords(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        for(int end = 0; end <= s.length(); end++){
            if(end == s.length() || ch[end] == ' '){
                reverse(ch, start, end-1);
                start = end+1;
            }
        }
        return new String(ch);
    }

        public void reverse(char ch[], int start, int end){
            while(start < end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
}