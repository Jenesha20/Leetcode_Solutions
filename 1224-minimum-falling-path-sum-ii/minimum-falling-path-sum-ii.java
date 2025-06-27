class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] l=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                l[i][j]=Integer.MAX_VALUE;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        min=Math.min(min,fin(grid,0,i,l));
        return min;
    }
    public static int fin(int[][] grid,int row,int  col,int[][] temp)
    {
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length)
        return Integer.MAX_VALUE;
        if(row==grid.length-1)
        return grid[row][col];
        if(temp[row][col]!=Integer.MAX_VALUE)
        return temp[row][col];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++)
        {
            if(i!=col)
            {
            int val=fin(grid,row+1,i,temp);
            min=Math.min(val,min);
            }
        } 
        temp[row][col]=grid[row][col]+min;
        return temp[row][col];
    }
}