class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        String[] res=new String[s1.length];
       for(int i=0;i<s1.length;i++)
       {
        StringBuilder sb=new StringBuilder();
        sb.append(s1[i]);
        sb.reverse();
        s1[i]=sb.toString();
       }
        s = String.join(" ", s1);
       return s;
    }
}