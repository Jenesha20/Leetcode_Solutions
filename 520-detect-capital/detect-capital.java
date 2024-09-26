class Solution {
    public boolean detectCapitalUse(String word) {
        int l=0,u=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(c))
            {
                u++;
            }
            else if(Character.isLowerCase(c))
            {
                l++;
            }
        }
        if(l==word.length() || u==word.length())
        {
            return true;
        }
        else if(u==1 && Character.isUpperCase(word.charAt(0)))
        {
            return true;
        }
        else
        return false;
    }
}