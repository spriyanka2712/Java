package Day21;
import java.util.function.Consumer;
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<String> printString = (s)->System.out.println(s);
        Consumer<Student> printName = (s)->System.out.println(s.name);
        printName.accept(new Student("test1"));
        printString.accept("From Consumer");
    }
}