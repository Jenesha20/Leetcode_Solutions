class Solution {
    public int pivotInteger(int n) {
        int t=0;
        for(int i=1;i<=n;i++)
        t+=i;
        int l=0;
        for(int i=1;i<=n;i++)
        {
            int r=t-l-i;
            if(r==l)
            return i;
            l+=i;
        }
        return -1;
    }
}