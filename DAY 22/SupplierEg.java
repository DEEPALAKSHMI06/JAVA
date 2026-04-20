
import java.lang.Math;
import java.util.function.Supplier;
class Person{
    String name="Supplier";
}

public class SupplierEg {
    public static void main(String[] args) {
        Supplier <Integer> s=()->(int)(Math.random()*100);
        System.out.println(s.get());
        Supplier<Person> p=()->new Person();
        System.out.println(p.get().name);
    }
}
