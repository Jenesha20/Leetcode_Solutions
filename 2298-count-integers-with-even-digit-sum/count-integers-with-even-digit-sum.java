class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++)
       {
            if(i<9)
           {
            if(i%2==0)
            c++;
           }
            else
            {
                int s=0;
                int x=i;
                while(x!=0)
                {
                    int temp=x%10;
                    s+=temp;
                    x/=10;
                }
                if(s%2==0)
                c++;
            }
       }
       return c;
    }
}