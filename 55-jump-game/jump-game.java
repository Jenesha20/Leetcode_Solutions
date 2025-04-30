import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
    //     int max=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(i>max)
    //         {
    //             return false;
    //         }
    //         max=Math.max(max,i+nums[i]);
    //     }
    //    return true; 

    int[] dp=new int[nums.length];
    Arrays.fill(dp,nums.length);
    return mj(nums,dp);
    }
    public static boolean mj(int[] nums,int[] dp)
    {
        if(nums.length==1 && nums[0]==0)
        return true;
        if(nums[0]==0)
        return false;
        dp[0]=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<=nums[i];j++)
            {
                if(i+j<nums.length)
                {
                    dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                }
            }
        }
        if(dp[nums.length-1]==nums.length)  return false;

        return true;

    }
}