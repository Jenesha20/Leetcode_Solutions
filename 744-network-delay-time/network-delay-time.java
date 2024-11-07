class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dis=new int[n+1];
        int e=times.length;
        for(int i=1;i<=n;i++)
        {
            dis[i]=(int)1e9;
        }
        dis[k]=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<e;j++)
            {
                int u=times[j][0];
                int v=times[j][1];
                int wt=times[j][2];
                if(dis[u]+wt<dis[v])
                {
                    dis[v]=dis[u]+wt;
                }
            }
        }
        int m=0;
        for(int x:dis)
        {
            if(x==(int)1e9)
            {
                return -1;
            }
            m=Math.max(m,x);
        }
        return m;
    }
}