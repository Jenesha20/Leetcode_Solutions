class Solution {
    public void moveZeroes(int[] nums) {
    //    int i=0;
    //   for(int j=0;j<nums.length;j++)
    //   {
    //     if(nums[j]!=0)
    //     {
    //         nums[i]=nums[j];
    //         i++;
    //     }
    //   }
    //    for(int j=i;j<nums.length;j++)
    //    nums[j]=0;
    // }
   int l=0;
   int r=0;
   while(r<nums.length)
   {
    if(nums[r]!=0)
    {
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
        l++;
    }
    r++;
   }
}
}