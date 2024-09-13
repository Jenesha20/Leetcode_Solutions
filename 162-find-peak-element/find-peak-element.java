class Solution {
    public int findPeakElement(int[] nums) {
     int m=nums[0];
     for(int i=0;i<nums.length;i++)
     m=Math.max(m,nums[i]);
     HashMap<Integer,Integer> hmap=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        hmap.put(nums[i],i);
     }
     return hmap.get(m);
    }
}