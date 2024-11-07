class Pair
{
    int row;
    int col;
    int c;
    Pair(int row,int col,int c)
    {
        this.row=row;
        this.col=col;
        this.c=c;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[] drow={1,-1,0,0};
        int[] dcol={0,0,-1,1};
        int m=mat.length;
        int n=mat[0].length;
        int[][] temp=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {

                if(mat[i][j]==0)
                {
                    vis[i][j]=1;
                q.add(new Pair(i,j,0));
                }
            }
        }
        while(!q.isEmpty())
        {
            int r=q.peek().row;
            int c=q.peek().col;
            int count=q.peek().c;
            q.poll();
            temp[r][c]=count;
            for(int i=0;i<4;i++)
            {
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]!=1)
                {
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol,count+1));
                }
            }
        }
        return temp;
    }
}