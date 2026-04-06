import java.util.ArrayList;
public class Wrapper_2 {
    public static void main(String[] args) {
        //int[] arr=new Int[];  ->faster as primitive datatype is used
        ArrayList <Integer> l1=new ArrayList <>();// slower
        l1.add(10);
        int i=l1.get(0);
        System.out.println(i);

    }
}
