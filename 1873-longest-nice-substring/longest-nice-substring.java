class Solution {
    public static boolean sub(String s)
    {
        char[] c=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(char x:c)
        set.add(x);
        for(char x:c)
        {
            if(Character.isLowerCase(x) && !set.contains(Character.toUpperCase(x)))
            return false;
            if(Character.isUpperCase(x) && !set.contains(Character.toLowerCase(x)))
            return false;
        }
       return true;
    }
    public String longestNiceSubstring(String s) {
        if(s.length()==1)
        return "";
        for(int w=s.length();w>0;w--)
        {
            for(int i=0;(i<=s.length()-w);i++)
            {
              boolean str=sub(s.substring(i,i+w));
              if(str)
              {
                return s.substring(i,i+w);
              }
            }
        }
        return "";
    }

}