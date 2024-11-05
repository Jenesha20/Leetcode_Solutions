class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int x:nums)
        hmap.put(x,hmap.getOrDefault(x,0)+1);
        //int c=0;
        for(int x:hmap.keySet())
        {
            if(hmap.get(x)==1)
            {
                return x;
            }
        }
        return 0;
    }
}