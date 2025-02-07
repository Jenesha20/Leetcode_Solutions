class Solution {
    public int countMatches(List<List<String>> items, String rk, String rv) {
        int c=0;
        int k=0;
        if(rk.equals("type"))
        k=0;
        else if(rk.equals("color"))
        k=1;
        else
        k=2;
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).get(k).equals(rv))
            c++;
        }
        return c;
    }
}