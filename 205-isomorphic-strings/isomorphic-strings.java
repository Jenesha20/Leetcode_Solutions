class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> hmap1=new HashMap<>();
        HashMap<Character,Character> hmap2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(hmap1.containsKey(c1))
            {
                if(hmap1.get(c1)!=c2)
                {
                    return false;
                }
            }
            else
            hmap1.put(c1,c2);
            if(hmap2.containsKey(c2))
            {
                if(hmap2.get(c2)!=c1)
                {
                    return false;
                }
            }
            else
            hmap2.put(c2,c1);
        }
        return true;
    }
}