class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int l=0,r=p.length-1;
        int b=0;
        while(l<=r)
        {
            if(p[l]+p[r]<=limit)
            {
                l++;
                r--;
            }
            else
            {
                r--;
            }
            b++;
        }
        return b;
    }
}