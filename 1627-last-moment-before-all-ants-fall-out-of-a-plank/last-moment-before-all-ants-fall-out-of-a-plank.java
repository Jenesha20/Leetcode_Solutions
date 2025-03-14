class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
     int t=0;
     for(int x:left)   
     t=Math.max(x,t);
     for(int x:right)
     t=Math.max(t,n-x);
     return t;
    }
}