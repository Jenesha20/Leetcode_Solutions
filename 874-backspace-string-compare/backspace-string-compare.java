class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> s1=new Stack<>();
       Stack<Character> s2=new Stack<>();
       for(int i=0;i<s.length();i++)
       {
        char c=s.charAt(i);
        if(c!='#')
        {
            s1.push(c);
        }
        else if(!s1.isEmpty())
        {
            s1.pop();
        }
       } 
       for(int i=0;i<t.length();i++)
       {
        char c=t.charAt(i);
        if(c!='#')
        {
            s2.push(c);
        }
        else if(!s2.isEmpty())
        {
            s2.pop();
        }
       } 
      
       if(s1.equals(s2))
       return true;
       else
       return false;
    }
}