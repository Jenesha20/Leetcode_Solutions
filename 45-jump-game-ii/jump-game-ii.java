import java.util.*;
public class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
     return mj(nums,dp);
    }
    public static int mj(int[] arr,int[] dp)
    {
        if(arr[0]==0)
        return 0;
        dp[0]=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                if(i+j<arr.length)
                {
                    dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        return dp[arr.length-1]!=Integer.MAX_VALUE ? dp[arr.length-1] :-1;
    }
}
