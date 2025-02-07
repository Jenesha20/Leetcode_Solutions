class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       int[] t=new int[nums.length];
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<nums.length;i++)
      {
        l.add(index[i],nums[i]);
      }
      int j=0;
      for(int x:l)
      {
        t[j++]=x;
      }
      return t;
    }
}