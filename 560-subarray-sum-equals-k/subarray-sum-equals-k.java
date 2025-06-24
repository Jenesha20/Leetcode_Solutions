class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(0,1);
        int c=0,s=0;
        for(int x:nums)
        {
            s+=x;
            if(hmap.containsKey(s-k))
            c+=hmap.get(s-k);
            hmap.put(s,hmap.getOrDefault(s,0)+1);
        }
        return c;
    }
}