class Solution {
    public int pivotIndex(int[] nums) {
     int s=0;
     for(int x:nums)
     s+=x;
     int l=0;
     for(int i=0;i<nums.length;i++)
     {
        int r=s-l-nums[i];
        if(r==l)
        return i;
        l+=nums[i];
     }   
     return -1;
    }
}