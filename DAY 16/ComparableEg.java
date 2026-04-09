import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;
    }
    @Override
    public String toString(){
        return name+"--"+mark;
    }
}
public class ComparableEg{
    public static void main(String[] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("A",70));
        s.add(new Student("B",76));
        s.add(new Student("C",98));
        s.add(new Student("S",43));
        Collections.sort(s);
        System.out.println(s);
    }

}

