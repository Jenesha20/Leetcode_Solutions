class Solution {
    public int minSwapsCouples(int[] row) {
      int c=0;
      for(int i=0;i<row.length;i+=2)
      {
        int f=row[i];
        int s=(f%2==0) ? f+1 :f-1;
        if(row[i+1]!=s)
        {
            c++;
            for(int j=i+2;j<row.length;j++)
            {
                if(row[j]==s)
                {
                    int t=row[j];
                    row[j]=row[i+1];
                    row[i+1]=t;
                    break;
                }
            }
        }
      }
      return c;
    }
}