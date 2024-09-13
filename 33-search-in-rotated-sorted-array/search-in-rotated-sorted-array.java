class Solution {
    public int search(int[] nums, int target) {
     HashMap<Integer,Integer> hmap=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     hmap.put(nums[i],i);
     if(hmap.containsKey(target))
     return hmap.get(target);
     else
     return -1;
    }
}