package Day16;
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student s){
        return s.mark-this.mark;
    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }
}
public class ComparableExample {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 70));
        students.add(new Student("B", 55));
        students.add(new Student("C", 85));
        students.add(new Student("D", 60));
        Collections.sort(students);
        for(Student s : students){
            System.out.println(s.name+"-"+s.mark);
        }
    }
}
