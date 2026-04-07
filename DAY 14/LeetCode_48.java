public class LeetCode_48 {
    class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp=0;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<=right){
                temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}
}
