class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap=new HashMap<>();
        String[] ns=s.split(" ");
        if(pattern.length()!=ns.length)
        return false;
        for(int i=0;i<ns.length;i++)
        {
            char c=pattern.charAt(i);
            if(!hmap.containsKey(c))
            {
                if(hmap.containsValue(ns[i]))
                {
                    return false;
                }
                hmap.put(c,ns[i]);
            }
            else if(!(hmap.get(c).equals(ns[i])))
            {
               return false;
            }
        }
        return true;
    }
}