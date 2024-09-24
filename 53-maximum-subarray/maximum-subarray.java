class Solution {
    public int maxSubArray(int[] nums) {
       int s=0,m=nums[0];
       for(int i=0;i<nums.length;i++)
       {
        s+=nums[i];
        if(s>m)
        m=s;
        if(s<0)
        s=0;
       }
       return m;
    }
}