class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
        return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            sb[i]=new StringBuilder();
        }
        int c=0;
        boolean g=false;
        for(char x:s.toCharArray())
        {
            sb[c].append(x);
            if(c==0 || c==numRows-1)
            g=!g;
            c+=g ? 1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder x:sb)
        res.append(x);
        return res.toString();
    }
}