import java.util.*;
class Solution {
    public int fib(int n) {
       /* int a=0,b=1,c=0;
        if(n==1)
        return a+b;
        for(int i=0;i<n-1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;*/
        // if(n<=1)
        // return n;
        // else
        // return fib(n-1)+fib(n-2);

        //memozation

         int[] dp=new int[n+1];
         Arrays.fill(dp,-1);
         return helper(n,dp);


    
    }
    public static int helper(int n,int[] dp)
    {
        if(n<=1)
         return n;
         if(dp[n]!=-1)
         return dp[n];
         dp[n]=helper(n-2,dp)+helper(n-1,dp);
         return dp[n];
    }
}