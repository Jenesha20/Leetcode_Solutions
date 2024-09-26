class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int x:nums1)
        hmap.put(x,hmap.getOrDefault(x,0)+1);
        for(int x:nums2)
        {
           if(hmap.containsKey(x) && hmap.get(x)>0)
           {
            l.add(x);
            hmap.put(x,hmap.get(x)-1);
           }
        }
        int[] a=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            a[i]=l.get(i);
        }
        return a;
    }
}