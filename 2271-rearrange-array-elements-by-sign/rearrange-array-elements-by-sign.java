class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> l1=new ArrayList<>(); 
       List<Integer> l2=new ArrayList<>();
       int[] a=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>=0)
        l1.add(nums[i]);
        else
        l2.add(nums[i]);
       }
       int j=0;
       for(int i=0;i<l1.size();i++)
       {
        a[j++]=l1.get(i);
        a[j++]=l2.get(i);
       }
       return a;
    }
}