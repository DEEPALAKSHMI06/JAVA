
import java.util.List;
import java.util.function.Consumer;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}

public class ConsumerEg {
    public static void main(String[] args) {
        Consumer<String> printString=(s)->System.out.println(s);
        printString.accept("From consumer");
        Consumer<Student> printName=(s)->System.out.println(s.name);
        printName.accept(new Student("test1"));
        List<String> names=List.of("abc","def","ghi");   //forEach using lambda function
        names.forEach(name->System.out.println(name));
        //shortcut for lambda function
        names.forEach(System.out::println);
    }
}
