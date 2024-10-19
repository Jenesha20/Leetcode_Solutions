class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int x:arr)
        hmap.put(x,hmap.getOrDefault(x,0)+1);
        int m=-1;
        for(int x:hmap.keySet())
        {
            if(x==hmap.get(x))
            {
             m=Math.max(m,x);   
            }
        }
        return m;
    }
}