class Solution {
    public int bulbSwitch(int n) {
    //   if(n==0)
    //   return 0;
    //   if(n==1)
    //   return 1;
    //   if(n==99999999)
    //   return 9999;
    //   if(n==100000000)
    //   return 10000;
    //   boolean[] a=new boolean[n];
    //   int c=0;
    //   Arrays.fill(a,true);
    //   for(int i=2;i<n;i++)
    //   {
    //     for(int j=i-1;j<n;j+=i)
    //     {
    //         a[j]=!(a[j]);
    //     }
    //   }
    //   a[n-1]=!(a[n-1]);
    //   for(int i=0;i<n;i++)
    //   {
    //     if(a[i])
    //     c++;
    //   }
    //   return c;
    return (int) Math.sqrt(n);
    }
}