class Solution {
    public int findCheapestPrice(int n, int[][] flight, int src, int dst, int k) {
        int[] dis=new int[n];
        for(int i=0;i<n;i++)
        dis[i]=(int)1e9;
        int e=flight.length;
        dis[src]=0;
        for(int i=0;i<=k;i++)
        {
            int[] temp = Arrays.copyOf(dis, n);
            for(int j=0;j<e;j++)
            {
                int u=flight[j][0];
                int v=flight[j][1];
                int wt=flight[j][2];
                if(dis[u]+wt<temp[v])
                {
                    temp[v]=dis[u]+wt;
                }
            }
            dis=temp;
        }
        if(dis[dst]==(int)1e9)
        return -1;
        else
        return dis[dst];
    }
}