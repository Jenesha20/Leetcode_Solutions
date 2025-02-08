class Solution {
    public int largestAltitude(int[] gain) {
       int[] a=new int[gain.length+1];
       a[0]=0;
       int j=0;
       for(int i=1;i<a.length;i++)
       {
        a[i]=a[i-1]+gain[j++];
       } 
       int m=0;
      for(int i=0;i<a.length;i++)
      m=Math.max(m,a[i]);
      return m;
    }
}