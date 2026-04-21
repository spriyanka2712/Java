package Day21;
import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark = mark;
    }
}

public class PredicateExample {
    public static void main(String[] args){
        Predicate<Integer> isEven=(n)->n%2==0;
        Predicate<Integer> isOdd=isEven.negate();
        Predicate<Student> isPass=(s)->s.mark>40;
        System.out.println(isPass.test(new Student(45)));
        System.out.println(isEven.test(99999));
    }
}
