class Solution {
    static boolean isop(String ch)
    {
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/");
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(isop(tokens[i]))
            {
                int n2=st.pop();
                int n1=st.pop();
                switch(tokens[i])
                {
                    case "+":
                    st.push(n1+n2);
                    break;
                    case "-":
                    st.push(n1-n2);
                    break;
                    case "*":
                    st.push(n1*n2);
                    break;
                    case "/":
                    st.push(n1 / n2);
                    break;
                }
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}