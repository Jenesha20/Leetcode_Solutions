class Solution {
    public int maximumCandies(int[] candies, long k) {
        int l=1,r=candies[0],t=0;
        for(int x:candies)
       {
         r=Math.max(r,x);
       }
        int res=0;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(can(candies,k,mid))
            {
                res=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return res;
    }
    static boolean can(int[] a,long k,int mid)
    {
        long c=0;
        for(int x:a)
       {
        if(x>=mid)
         c+=x/mid;
       }
        return c>=k;
    }
}