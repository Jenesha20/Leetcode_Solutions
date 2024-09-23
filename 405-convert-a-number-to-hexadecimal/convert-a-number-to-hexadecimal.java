class Solution {
    public String toHex(int num) {
       if(num==0)
       return "0";
       char[] hex=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'}; 
       StringBuilder sb=new StringBuilder();
       int c=0;
       while(c<8 && num!=0)
       {
        sb.append(hex[num & 15]);
        num=num>>4;
        c++;
       }
       return sb.reverse().toString();
    }
}
//989