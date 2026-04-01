public class LeetCode_134 {
    class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0,start=0;
        int totgas=0,totcost=0;
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totcost+=cost[i];
            tank+=gas[i]-cost[i];
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totgas>=totcost){
            return start;
        }
        return -1;

    }
}
}
