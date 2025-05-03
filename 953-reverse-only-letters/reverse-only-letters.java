class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0,r=s.length()-1;
        char[] ch=s.toCharArray();
        while(l<=r)
        {
            if(Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r)))
            {
                char t=ch[l];
                ch[l]=ch[r];
                ch[r]=t;
                l++;
                r--;
            }
            else if(!Character.isLetter(ch[l]))
            {
               l++;
            }
            else if(!Character.isLetter(ch[r]))
            r--;
        }
        return new String(ch);
    }
}