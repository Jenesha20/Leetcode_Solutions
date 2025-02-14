class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int x:arr)
        hmap.put(x,hmap.getOrDefault(x,0)+1);
        HashSet<Integer> set=new HashSet<>();
        for(int x:hmap.keySet())
        {
            if(set.contains(hmap.get(x)))
            return false;
            else
            set.add(hmap.get(x));
        }
        return true;
    }
}