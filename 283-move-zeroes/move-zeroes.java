class Solution {
    public void moveZeroes(int[] nums) {
       int x=0,c=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            c++;
        }
        if(nums[i]!=0)
        {
            nums[x]=nums[i];
            x++;
        }
       }
       while(c!=0)
       {
        nums[x]=0;
        x++;
        c--;
       }
    }
}