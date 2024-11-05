class Solution {
    int vis[];
    public void dfs(List<List<Integer>> adj,int i)
    {
         vis[i]=1;
         for(int x:adj.get(i))
         {
            if(vis[x]==0)
            {
                dfs(adj,x);
            }
         }
    }
    public int findCircleNum(int[][] matrix) {
        vis=new int[matrix.length];
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            l.add(new ArrayList<>());
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1 && i!=j)
                {
                    l.get(i).add(j);
                    l.get(j).add(i);
                }
            }
        }
        int c=0;
        for(int i=0;i<matrix.length;i++)
        {
           if(vis[i]!=1)
           {
            dfs(l,i);
            c++;
           }
        }
        return c;
    }
}