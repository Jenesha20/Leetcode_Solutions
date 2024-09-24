class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] n=new int[nums1.length+nums2.length];
       int i=0,k=0;
       for(i=0;i<nums1.length;i++)
       {
        n[i]=nums1[i];
       }
       for(int j=0;j<nums2.length;j++)
       {
        n[i++]=nums2[j];
       }
       Arrays.sort(n);
       double s;
       int x=n.length/2;
       if(n.length%2!=0)
       {
        s=n[x];
        return s;
       }
       else
       {
        s=(n[x]+n[x-1])/2.0;
        return s;
       }
    }
}