import java.util.ArrayList;
import java.util.Arrays;

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,4,3,4,5,6));
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;    // after removing elements are shifted
            }
        }
        System.out.println(list);
    }
}
