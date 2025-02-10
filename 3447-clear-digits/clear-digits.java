class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(char x:s.toCharArray())
        {
            if(!Character.isDigit(x))
            {
                sb.append(x);
            }
            else
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}