class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double m=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            m=Math.max(sum,m);
        }
        return m/k;
    }
}