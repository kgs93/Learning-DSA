import java.util.*;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] rowsArray:accounts){
            int sum=0;
            for(int money:rowsArray ){
                sum+=money;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
public class Leetcode1672 {
    public static void main(String[] args){
    Solution soln=new Solution();
    int[][] arr={
            {1,2,3},
            {5,7,8}
    };
    System.out.println(soln.maximumWealth(arr));
}
}



