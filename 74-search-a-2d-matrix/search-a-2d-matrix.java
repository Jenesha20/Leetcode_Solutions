class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<matrix.length;i++)
      {
        for(int j=0;j<matrix[0].length;j++)
        {
            l.add(matrix[i][j]);
        }
      } 
      for(int x:l)
      if(l.contains(target))
      return true;
      return false;
    // int l=0;
    // int  r=matrix[0].length-1;
    // while(l<matrix.length && r>=0)
    // {
    //     if(matrix[l][r]==target)
    //     return true;
    //     if(matrix[l][r]<target)
    //     l++;
    //     else
    //     r--;
    // }
    // return false;
    }
}