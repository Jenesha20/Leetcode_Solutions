class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] or=new int[grid.length];
        int[] oc=new int[grid[0].length];
        int[] zr=new int[m];
        int[] zc=new int[n];
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            int s=0;
            int os=0;
            for(int j=0;j<n;j++)
            {
               if(grid[i][j]==1)
               s++;
               if(grid[i][j]==0)
               os++;
            }
            or[i]=s;
            zr[i]=os;
        }
       for(int j=0;j<n;j++)
       {
        int s=0;
        int os=0;
        for(int i=0;i<m;i++)
        {
           if(grid[i][j]==1)
           s++;
           if(grid[i][j]==0)
           os++;
        }
        oc[j]=s;
        zc[j]=os;
       }
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
           temp[i][j]=or[i]+oc[j]-zr[i]-zc[j];
        }
       }
      return temp;
    }
}