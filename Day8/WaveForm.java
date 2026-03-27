package Day8;
import java.util.*;
public class WaveForm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(i%2==0){
                res += s.charAt(i);
            }
        }
        for(int i = 1; i < s.length(); i++){
            if(i%2!=0){
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
