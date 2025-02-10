class Solution {
    public long countBadPairs(int[] nums) {
        long c=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           int k=nums[i]-i;
           c+=hmap.getOrDefault(k,0);
           hmap.put(k,hmap.getOrDefault(k,0)+1);
        }
        return (long) nums.length *(nums.length-1)/2 -c;
    }
}