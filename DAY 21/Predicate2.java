
import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}

public class Predicate2 {
   public static void main(String[] args) {
       Predicate<Student> isPass=(s)->s.mark>40;
       System.out.println(isPass.test(new Student(87))); 
   }
}
