class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int x:nums)
        s+=x;
        if(s%2!=0)
        return false;
        int n=s/2;
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int x:nums)
        {
            for(int i=n;i>=x;i--)
            {
                dp[i]=dp[i]||dp[i-x];
            }
        }
        return dp[n];
    }
}