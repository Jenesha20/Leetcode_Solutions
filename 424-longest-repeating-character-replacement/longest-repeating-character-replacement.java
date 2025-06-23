class Solution {
    public int characterReplacement(String s, int k) {
     int l=0,m=0,mc=0;
     int[] c=new int[26];
     for(int r=0;r<s.length();r++)
     {
        c[s.charAt(r)-'A']++;
        mc=Math.max(mc,c[s.charAt(r)-'A']);
        if((r-l+1)-mc >k)
        {
            c[s.charAt(l)-'A']--;
            l++;
        }
     }
     return s.length()-l;
    }
}