class Solution {
     boolean isVowel(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
        }

    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(isVowel(ch[start]) && isVowel(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }  
            else if(!isVowel(ch[start])){
                start++;
            }  
            else{
                end--;
            }
        }
        return new String(ch); 
    }
       
}