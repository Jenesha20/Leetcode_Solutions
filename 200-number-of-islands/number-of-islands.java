class Solution {
    boolean[][] vis;
    public void dfs(char[][] grid,int row,int col)
    {
        vis[row][col]=true;
        int m=grid.length;
        int n=grid[0].length;
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,-1,1};
        if(grid[row][col]=='1')
        {
          for(int i=0;i<4;i++)
          {
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==false)
            {
                vis[nrow][ncol]=false;
                dfs(grid,nrow,ncol);
            }
          }
        }
    }
    public int numIslands(char[][] grid) {
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        vis=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                vis[i][j]=false;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && vis[i][j]==false)
                {
                    c++;
                    dfs(grid,i,j);
                }
            }
        }
        return c;
    }
}