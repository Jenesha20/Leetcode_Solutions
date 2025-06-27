class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
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
        {
            min=Math.min(min,fin(matrix,0,i,l));
        }
        return min;
    }
    public static int fin(int[][] matrix,int row,int col,int[][] temp)
    {
        if(row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length)
        return Integer.MAX_VALUE;
        if(row==matrix.length-1)
        return matrix[row][col];
        if(temp[row][col]!=Integer.MAX_VALUE)
        return temp[row][col];
        int l=fin(matrix,row+1,col-1,temp);
        int d=fin(matrix,row+1,col,temp);
        int r=fin(matrix,row+1,col+1,temp);
        temp[row][col]=matrix[row][col]+Math.min(l,Math.min(r,d));
        return temp[row][col];
    }
}