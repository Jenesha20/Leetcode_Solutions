class Solution {
    public int addDigits(int num) {
       while(num>9) num=check(num);
       return num;
    }
    public static int check(int n)
    {
        int s=0;
        while(n>0)
        {
            int x=n%10;
            s+=x;
            n/=10;
        }
        return s;
    }
}