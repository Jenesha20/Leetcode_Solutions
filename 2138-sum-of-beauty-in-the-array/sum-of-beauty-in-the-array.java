class Solution {
    public int sumOfBeauties(int[] nums) {
       int[] r=new int[nums.length];
       r[nums.length-1]=nums[nums.length-1];
       for(int i=nums.length-2;i>=2;i--)
       {
        r[i]=Math.min(r[i+1],nums[i]);
       } 
       int l=nums[0],a=0;
       for(int i=1;i<nums.length-1;i++)
       {
        if(nums[i]>l && nums[i]<r[i+1])
        a+=2;
        else if(nums[i-1]<nums[i] && nums[i]<nums[i+1])
        a+=1;
        l=Math.max(l,nums[i]);
       }
       return a;
    }
}