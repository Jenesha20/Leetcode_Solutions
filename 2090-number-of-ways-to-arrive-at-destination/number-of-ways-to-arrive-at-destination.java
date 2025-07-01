class Solution {
    class Pair
    {
        int node=0;
        long dis=0;
        Pair(long dis,int node)
        {
            this.dis=dis;
            this.node=node;
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int[] x:roads)
        {
            int u=x[0];
            int v=x[1];
            int w=x[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        long[] dist=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> Long.compare(a.dis,b.dis));
        pq.add(new Pair(0,0));
        long[] ways=new long[n];
        Arrays.fill(ways,0);
        ways[0]=1;
        long mod=1000000007;
        while(!pq.isEmpty())
        {
            Pair cur=pq.poll();
            long d=cur.dis;
            int node=cur.node;
            if(d>dist[node])
            continue;
            for(int[] neigh:adj.get(node))
            {
                long wt=neigh[1];
                int v=neigh[0];
                if(d+wt<dist[v])
                {
                    dist[v]=d+wt;
                    ways[v]=ways[node];
                    pq.add(new Pair(dist[v],v));

                }
                else if(d+wt==dist[v])
                {
                    ways[v]=(ways[v]+ways[node])%mod;
                }
            }
        }
        return (int)ways[n-1];
    }
}