class Solution {
    public String firstPalindrome(String[] words) {
        //String s;
        for(String x:words)
        {
            StringBuilder sb=new StringBuilder(x);
            if(sb.reverse().toString().equals(x))
            {
               return x;
            }
        }
        return "";
    }
}