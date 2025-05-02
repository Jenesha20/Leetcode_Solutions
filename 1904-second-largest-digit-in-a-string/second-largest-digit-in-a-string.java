class Solution {
    public int secondHighest(String s) {
       int fmax=-1,smax=-1;
       for(char x:s.toCharArray())
       {
        if(Character.isDigit(x))
        {
            int i=x-'0';
            if(i>fmax)
            {
                smax=fmax;
                fmax=i;
            }
           else if(i>smax && i<fmax)
            {
                smax=i;
            }
        }
       }
       return smax;
    }
}