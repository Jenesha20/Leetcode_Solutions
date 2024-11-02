class Solution {
    public boolean isCircularSentence(String str) {
      String[] s=str.split(" ");  
      for(int i=0;i<s.length-1;i++)
      {
        if(!(s[i].charAt(s[i].length()-1)==s[i+1].charAt(0)))
        {
            return false;
        }
      }
      return s[s.length-1].charAt(s[s.length-1].length()-1)==s[0].charAt(0);
    }
}