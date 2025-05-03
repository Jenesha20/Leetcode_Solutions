class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st=new Stack<>();
      //st.push(s.charAt(0));
      for(int i=0;i<s.length();i++)
      {
        if(st.isEmpty())
        st.push(s.charAt(i));
        else
        {
            if(st.peek()==s.charAt(i))
            st.pop();
            else
            st.push(s.charAt(i));

        }
      }  
      StringBuilder sb=new StringBuilder();
      while(!st.isEmpty())
      sb.append(st.pop());
      sb.reverse();
      return sb.toString();
    }
}