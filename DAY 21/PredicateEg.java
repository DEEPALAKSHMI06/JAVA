import java.util.function.Predicate;

public class PredicateEg {
    public static void main (String[] args){
        /*Predicate<Integer> isEven=new Predicate<Integer>() {
            public boolean test(Integer n){
                return n%2==0;
            }
        };*/
        // lambda funtion
        Predicate <Integer> isEven=(n)->n%2==0;
        Predicate<Integer> isOdd=isEven.negate(); // negation
        System.out.println(isEven.test(23468));
        System.out.println(isOdd.test(81));

        Predicate<String> str=(s)->{
            s.toLowerCase();
            return s.startsWith("a");
        };
        System.out.println(str.test("rtwr"));



    }
}
