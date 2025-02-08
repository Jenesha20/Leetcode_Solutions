class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int x:nums1)
        s1.add(x);
        for(int x:nums2)
        s2.add(x);
        s1.retainAll(s2);
        int[] a=new int[s1.size()];
        int i=0;
        for(int x:s1)
        a[i++]=x;
        return a;

    }
}