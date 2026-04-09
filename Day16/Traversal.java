package Day16;
import java.util.*;
public class Traversal {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // Iterator<Integer> it = list.iterator();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            int current = it.next();
            if(current == 4){
                it.remove();
            }
        }
        while(it.hasPrevious()){
            int prev = it.previous();
            System.out.print(prev);
        }
        System.out.println(list);
    }
}
