class Solution {
    public int countTriplets(int[] arr) {
      int c=0;
      for(int i=0;i<arr.length;i++)
      {
        int a=0;
        for(int j=i;j<arr.length;j++)
        {
            a=a^arr[j];
             if(a==0)
             c+=(j-i);
        }
      }  
      return c;
    }
}