class Solution {
    public void sortColors(int[] nums) {
      int z=0,o=0,t=0,j=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==0)
        z++;
        if(nums[i]==1)
        o++;
        if(nums[i]==2)
        t++;
      }
     j=0;
     int x=0;
     while(j<z)
     {
        nums[x++]=0;
    //z--;
        j++;
     }
       j=0;
     while(j<o)
     {
        nums[x++]=1;
        j++;
     }
       j=0;
     while(j<t)
     {
        nums[x++]=2;
       // t--;
        j++;
     }
    }
}