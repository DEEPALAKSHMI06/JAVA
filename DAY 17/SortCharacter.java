import java.util.*;
public class SortCharacter {
    public static List<Character> sortChar(String s){
        //frequency
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        // map stored in list
        //map's data type is Map.Entry
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        //sort
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b){
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue();
                }
                return a.getKey()-b.getKey();
            }

        });
        //LAMBDA FUNCTION
        //Collections.sort(list,(a,b)->){
            //if(!a.getValue().equals(b.getValue())){
                   // return b.getValue()-a.getValue();
               // }
               // return a.getKey()-b.getKey();
           // }   
        List<Character> result=new ArrayList<>();
        //list(map entries) -> list(characters)
        for(Map.Entry<Character,Integer> i:list){
            result.add(i.getKey());
        }
        return result;
    }
    public static void main(String[] args){
        String s="tree";
        System.out.println(sortChar(s));
    }

}
