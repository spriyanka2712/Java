package Day12;
public class Wrapper {
    public static Integer test1(String s){
        return Integer.valueOf(s);
    }

    public static void main(String[] args){
        Integer b = Integer.valueOf("123456");
        Integer c = Integer.parseInt("0987");
        int a = b.intValue();
        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);
        System.out.println(x.equals(y));

    }
}

