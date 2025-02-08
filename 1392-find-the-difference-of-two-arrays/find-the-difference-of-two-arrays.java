class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int x:nums1)
        s1.add(x);
        for(int x:nums2)
        s2.add(x);
         HashSet<Integer> s3=new HashSet<>(s1);
        s3.removeAll(s2);
        s2.removeAll(s1);
        List<Integer>l1=new ArrayList<>();
        for(int x:s3)
        {
            l1.add(x);
        }
        l.add(l1);
        List<Integer>l2=new ArrayList<>();
        for(int x:s2)
        l2.add(x);
        l.add(l2);
        return l;
    }
}