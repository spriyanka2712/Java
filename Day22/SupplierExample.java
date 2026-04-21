package Day22;
import java.util.function.Supplier;
import java.lang.Math;

class Person{
    String name="Supplier";
}

public class SupplierExample {
    public static void main(String[] args){
        Supplier<Integer> s = ()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Person> p = ()->new Person();
        System.err.println(p.get().name);
    }
}
