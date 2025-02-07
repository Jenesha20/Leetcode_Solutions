class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        for(char x:s.toCharArray())
        {
            if(x!='*')
            sb.append(x);
            else
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}