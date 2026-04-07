import java.util.HashSet;
import java.util.Set;

public class LeetCode_268 {
    class Solution {
    public int missingNumber(int[] nums) {
       Set <Integer> set=new HashSet<>();
       int n=nums.length;
       for(int i:nums){
        set.add(i);
       }
       for(int i=0;i<=n;i++){
        if(!set.contains(i)){
            return i;
        }
       }
       return -1;
    }
}
}
