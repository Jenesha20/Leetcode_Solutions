class Solution {
    public int[] plusOne(int[] d) {
       for(int i=d.length-1;i>=0;i--)
       {
        if(d[i]!=9)
        {
          d[i]+=1; 
          return d; 
        }
        d[i]=0;
       } 
       int n[]=new int[d.length+1];
       n[0]=1;
       return n;
    }
}