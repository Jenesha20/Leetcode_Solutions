class Solution {
    class Pair
    {
        int node;
        int dis;
        Pair(int node,int dis)
        {
            this.node=node;
            this.dis=dis;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=1;i<=n+1;i++)
        adj.add(new ArrayList<>());
        for(int[] x:times)
        {
           int u=x[0];
           int v=x[1];
           int w=x[2];
           adj.get(u).add(new int[]{v,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.dis-b.dis);
        pq.add(new Pair(k,0));
        while(!pq.isEmpty())
        {
            Pair cur=pq.poll();
            int node=cur.node;
            int d=cur.dis;
            for(int[] neigh:adj.get(node))
            {
                int u=neigh[0];
                int wt=neigh[1];
                if(d+wt<dist[u])
                {
                    dist[u]=d+wt;
                    pq.add(new Pair(u,dist[u]));
                }
            }
        }
        int max=0;
        for(int i=1;i<n+1;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)
            return -1;
            max=Math.max(max,dist[i]);
        }
        return max;
    }
}