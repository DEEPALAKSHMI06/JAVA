import java.util.*;
public class MapEg_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,2,4,3};
        Map <Integer,Integer> map=new HashMap<>();
        for(int i:arr){
           // if(map.containsKey(i)){
             //   map.put(i,map.get(i)+1);
            //}else{
              //  map.put(i,1);
            //}
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry <Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" existed "+entry.getValue()+" times ");
        }

    }
}
