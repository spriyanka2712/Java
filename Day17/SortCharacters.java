package Day17;
import java.util.*;
public class SortCharacters {
    public static List<Character> sortChar(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b){
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue() - a.getValue();
                }
                return a.getKey() - b.getKey();
            }
        });
        List<Character> res = new ArrayList<>();
        for(Map.Entry<Character, Integer> i:list){
            res.add(i.getKey());
        }
        return res;
    }
    public static void main(String[] args){
        String s = "tree";
        System.out.print(sortChar(s));
    }
}
