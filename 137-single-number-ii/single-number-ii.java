class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> hmap=new HashMap<>();
       for(int x:nums)
       hmap.put(x,hmap.getOrDefault(x,0)+1);
       int m=0;
       for(int x:hmap.keySet())
       {
        if(hmap.get(x)==1)
        {
            m=x;
            break;
        }
       } 
       return m;
    }
}