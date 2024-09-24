class Solution {
    public int rob(int[] nums) {
        int m=0;
        if(nums.length==1)
        return nums[0];
        int[] n=new int[nums.length];
        n[0]=nums[0];
        n[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            n[i]=Math.max(n[i-1],nums[i]+n[i-2]);
        }
        return n[nums.length-1];
        
    }
}