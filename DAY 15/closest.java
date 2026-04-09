import java.util.TreeSet;

public class closest {
    public static void main(String[] args) {
        TreeSet <Integer> TSet=new TreeSet<>();  
        int [] arr={15,3,9,1,7,2};
        for(int i:arr){
            TSet.add(i); //{1,2,3,7,9,15}
        }
        int target=9;
        Integer High=TSet.higher(target);
        Integer Lower=TSet.lower(target);
        int result=0;
        if (Lower==null){
            result=High;
        }else if(High ==null){
            result=Lower;
        }
        else{
            result=target-Lower >= High-target?High:Lower;
        }
        System.out.println(result);
    }
    
}
