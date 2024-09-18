class Solution {
    public long maximumTripletValue(int[] nums) {
      long m=0;
      int[] l=new int[nums.length];
      int[] r=new int[nums.length];
      l[0]=nums[0];
      r[nums.length-1]=nums[nums.length-1];
      for(int i=1;i<nums.length;i++)
      {
        l[i]=Math.max(l[i-1],nums[i]);
      }
      for(int i=nums.length-2;i>=0;i--)
      {
        r[i]=Math.max(r[i+1],nums[i]);
      }
      for(int i=1;i<nums.length-1;i++)
      {
         long s=(long)(l[i-1]-nums[i])*r[i+1];
         m=Math.max(s,m);
      }
      return m;
    }
}