class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> s1=new Stack<>();
        Stack<StringBuilder> s2=new Stack<>();
        int n=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
               n=n*10+(c-'0');
            }
            else if(c=='[')
            {
               s1.push(n);
               n=0;
               s2.push(sb);
               sb=new StringBuilder();
            }
            else if(c==']')
            {
                int k=s1.pop();
                StringBuilder temp=sb;
                sb=s2.pop();
                while(k-- >0)
                {
                    sb.append(temp);
                }
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}