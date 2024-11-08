class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] dis=new double[n];
        for(int i=0;i<n;i++)
        dis[i]=0.0;
        dis[start_node]=1.0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<edges.length;j++)
            {
                int u=edges[j][0];
                int v=edges[j][1];
                double wt=succProb[j];
                if(dis[v]<dis[u]*wt)
                {
                    dis[v]=dis[u]*wt;
                }
                if(dis[u]<dis[v]*wt)
                {
                    dis[u]=dis[v]*wt;
                }
            }
        }
        if(dis[end_node]==0.0)
        return 0;
        else
        return dis[end_node];
    }
}