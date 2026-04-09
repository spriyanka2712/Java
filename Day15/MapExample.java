import java.util.*;
public class MapExample {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1, 2, 3, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            map.put(i, arr[i]);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        
    }
}
