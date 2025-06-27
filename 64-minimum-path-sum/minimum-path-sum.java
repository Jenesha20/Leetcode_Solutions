class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // for(int i=1;i<n;i++)
        // {
        //     grid[0][i]+=grid[0][i-1];

        // }
        // for(int i=1;i<m;i++)
        // grid[i][0]+=grid[i-1][0];
        // for(int i=1;i<m;i++)
        // {
        //     for(int j=1;j<n;j++)
        //     {
        //         grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
        //     }
        // }
        // return grid[m-1][n-1];
        int[][] l=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                l[i][j]=-1;
            }
        }
        return fin(grid,m-1,n-1,l);
    }
    public static int fin(int[][] grid,int row,int col,int[][] temp)
    {
        if(row==0 && col==0)
        return grid[row][col];
        if(row<0 || col<0)
        return Integer.MAX_VALUE;
        if(temp[row][col]!=-1)
        return temp[row][col];
        int l=fin(grid,row,col-1,temp);
        int r=fin(grid,row-1,col,temp);
        temp[row][col]=grid[row][col]+Math.min(l,r);
        return temp[row][col];
    }
}
