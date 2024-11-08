class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
      int[][] dis=new int[n][n];
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
            
            if(i==j)
            {
                dis[i][j]=0;
            }
            else
            {
                dis[i][j]=(int)1e9;
            }
        }
      }  
      for(int i=0;i<edges.length;i++)
      {
          int u=edges[i][0];
          int v=edges[i][1];
          int wt=edges[i][2];
          dis[u][v]=wt;
          dis[v][u]=wt;
      }
    
      for(int k=0;k<n;k++)
      {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dis[i][k]!=(int)1e9 && dis[k][j]!=(int)1e9 && dis[i][j]>dis[i][k]+dis[k][j])
                {
                    dis[i][j]=dis[i][k]+dis[k][j];
                }
            }
        }
      }
      int max=Integer.MAX_VALUE,index=0;
      for(int i=0;i<n;i++)
      {
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(dis[i][j]>0 && dis[i][j]<=distanceThreshold)
            {
                c++;
            }
        }
        if(c<max || (c==max && i>index))
        {
            max=c;
            index=i;
        }
      }
      return index;
    }
}