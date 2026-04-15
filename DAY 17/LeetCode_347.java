import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_347 {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      List<Integer> list=new ArrayList<>(map.keySet());
      Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
      int[] result=new int[k];
      for(int i=0;i<k;i++){
        result[i]=list.get(i);
      }
      return result;
    
    }
}
}
