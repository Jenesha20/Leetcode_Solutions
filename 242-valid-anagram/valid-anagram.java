class Solution {
    public boolean isAnagram(String s, String t) {
      char[] s1=s.toCharArray();
      char[] t1=t.toCharArray();
      Arrays.sort(s1);
      Arrays.sort(t1);
      String ns=new String(s1);
      String nt=new String(t1);
      return ns.equals(nt);
    }
}