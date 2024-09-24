class Solution {
    public int[] decrypt(int[] code, int k) {
      int[] a=new int[code.length];
      int s=0;
      if(k==0)
      Arrays.fill(a,0);
      if(k>0)
      {
        for(int i=0;i<code.length;i++)
        {
            s=0;
            for(int j=1;j<=k;j++)
            {
                s+=code[(i+j)%code.length];
            }
            a[i]=s;
        }
      }
      if(k<0)
      {
        k=-k;
        for(int i=0;i<code.length;i++)
        {
            s=0;
            for(int j=1;j<=k;j++)
            {
                s+=code[(i-j+code.length)%code.length];
            }
            a[i]=s;
        }
      }
      return a; 
    }
}