class Solution {
    public int nthUglyNumber(int n) {
       if(n==1)
       return 1;
       List<Integer> l=new ArrayList<>();
       l.add(1);
       int i=2;
       int x=0,y=0,z=0;
       while(l.size()<n)
       {
         int next=Math.min(l.get(x)*2,Math.min(l.get(y)*3,l.get(z)*5));
         l.add(next);
         if(next==l.get(x)*2)
         x++;
         if(next==l.get(y)*3)
         y++;
         if(next==l.get(z)*5)
         z++;
       } 
       return l.get(n-1);
    }
}