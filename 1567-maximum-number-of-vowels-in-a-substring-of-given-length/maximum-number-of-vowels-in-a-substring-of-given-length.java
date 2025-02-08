class Solution {
    HashSet<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
    public int maxVowels(String s, int k) {
       int c=0;
       int m=0;
       for(int i=0;i<k;i++)
       {
        if(set.contains(s.charAt(i)))
        c++;
       }
       m=c;
       for(int i=k;i<s.length();i++)
       {
        if(set.contains(s.charAt(i-k)))
        c--;
        if(set.contains(s.charAt(i)))
        c++;
        m=Math.max(m,c);
       }
      return m;
    }
}