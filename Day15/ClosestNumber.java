import java.util.*;
public class ClosestNumber {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        int arr[] = {15, 3, 9, 1, 7, 2};
        int target = 7;
        for(int i : arr){
            set.add(i);
        }
        Integer lowest = set.lower(target);
        Integer highest = set.higher(target);
        if(lowest == null){
            System.out.println(highest);
        }
        if(highest == null){
            System.out.println(lowest);
        }
        if(highest-target < target-lowest){
            System.out.println(highest);
        }
        else{
            System.out.println(lowest);
        }
    }
}
