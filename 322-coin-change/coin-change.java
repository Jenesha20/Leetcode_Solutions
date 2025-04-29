// import java.util.*;
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Arrays.sort(coins);
//         int l=0,r=coins.length-1;
//         int c=0;
//         int[] dp=new int[amount+1];
//         Arrays.fill(dp,-1);
//         while(l<=r)
//         {
//             int t=coins[l];
//             coins[l]=coins[r];
//             coins[r]=t;
//             l++;
//             r--;
//         }
//         return helper(coins,amount,dp);
//     }
//     public static int helper(int[] coins,int amount,int[] dp)
//     {
//         if(amount==0)
//         return 0;
//         if(dp[amount]!=-1)
//         return dp[amount];
        
//         int res=Integer.MAX_VALUE;
//         for(int i=0;i<coins.length;i++)
//         {
//             if(coins[i]<=amount)
//             {
//                 int sub=helper(coins,amount-coins[i],dp);
//                 if(sub != Integer.MAX_VALUE && sub+1<res)
//                 res=sub+1;
//             }
            
//         }
//         dp[amount]=res;
//         return dp[amount]!=Integer.MAX_VALUE && dp[amount]!=0 ? res:-1;
//     }
// }
class Solution {
     public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=amount;i++)
        {
            for(int x:coins)
            {
                if(i-x>=0 && dp[i-x]!=Integer.MAX_VALUE )
                {
                    dp[i]=Math.min(dp[i],dp[i-x]+1);
                }
            }
        }
        return dp[amount]!=Integer.MAX_VALUE?dp[amount] :-1;
     }
}