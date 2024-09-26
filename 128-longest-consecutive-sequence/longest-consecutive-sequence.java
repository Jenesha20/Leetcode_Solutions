class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1,m=0;
        if(nums.length==0)
        return 0;
       TreeMap<Integer,Integer> hmap=new TreeMap<>();
       for(int x:nums)
       hmap.put(x,hmap.getOrDefault(x,0)+1);
       Integer p=null;
       for(int x:hmap.keySet())
       {
        if(p!=null && x==p+1)
        {
           c++;
        }
        else
        {
            if(c>m)
            {
                m=c;
            }
            c=1;
        }
        p=x;
       } 
       m=Math.max(m,c);
       return m;
    }
}