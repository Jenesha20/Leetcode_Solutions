class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] a=new int[nums.length];
       for(int i=0;i<nums.length;i++) 
       {
        int l=i-1;
        int r=i+1;
        int ls=0;
        int rs=0,s=0;
        while(l>=0)
        {
            ls+=nums[l];
            l--;
        }
        while(r<nums.length)
        {
            rs+=nums[r];
            r++;
        }
        s=Math.abs(ls-rs);
        a[i]=s;
       }
       return a;
    }
}