package Day8;
import java.util.*;
public class EvenLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                res += s.charAt(i);
            }
            if(s.charAt(i) == ' ' && res.length()%2==0){
                System.out.print(res+" ");
                res = "";
            }
            else if(s.charAt(i) == ' '){
                res = "";
            }
        }
        if(res.length()%2==0 && res.length()>0){
            System.out.print(res);
        }
    }
}
