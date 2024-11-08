class Pair
{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    boolean[][] vis;
    public int bfs(int[][] grid,int row,int col){
        int m=grid.length;
        int n=grid[0].length;
        int[] drow={-1,1,0,0};
        int[] dcol={0,0,-1,1};
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col]=true;
        int count=1;
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            q.poll();
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==1 && vis[nrow][ncol]==false)
                {
                    vis[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol));
                    count++;
                }
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        vis=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                vis[i][j]=false;
            }
        }
        int res=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==false)
                {
                    res=bfs(grid,i,j);
                    max=Math.max(res,max);
                }
            }
        }
        return max;
    }
}