
import java.util.ArrayList;
import java.util.Arrays;

public class Alist_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,3,4,2,5,1));
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
