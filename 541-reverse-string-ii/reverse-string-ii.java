class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int l=1;
        for(int i=0;i<s.length();i+=k)
        {
             int end = Math.min(i + k, s.length());
            String s1=s.substring(i,end);
           if(l%2!=0)
           {
            sb.append(new StringBuilder(s1).reverse());
           }
           else
           {
            sb.append(s1);
           }
           l++;
        }
        return sb.toString();
        
    }
}