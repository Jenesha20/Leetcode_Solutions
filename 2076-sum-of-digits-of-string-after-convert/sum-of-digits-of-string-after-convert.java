class Solution {
    public int getLucky(String s, int k) {
       String str="";
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        int v=(c-'a')+1;
        str+=String.valueOf(v);
       }
       int r=0,i=0;
       while(i<k)
       {
        r=0;
        for(int j=0;j<str.length();j++)
        {
            r+=(str.charAt(j)-'0');
        }
        str=String.valueOf(r);
        i++;
       }
       return Integer.valueOf(str);
    }
}