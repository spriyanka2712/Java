import java.util.*;
public class Frequency {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();     
        Integer arr[] = {1, 2, 3, 1, 1, 1, 2, 4, 3};
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
            
        }
    }
}