package Day3;
public class method2 {
    static void change(int x){
        x = 20;
        System.out.println("Inside Method: "+x);
    }
    public static void main(String[] args){
        int a = 50;
        change(a);
        System.out.println("Outside Method: "+a);
    }
}
