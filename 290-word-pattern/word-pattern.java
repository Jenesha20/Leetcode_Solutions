class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hmap=new HashMap<>();
        String[] str=s.split(" ");
         if(pattern.length()!=str.length)
        return false;
        for(int i=0;i<str.length;i++)
        {
            if(!hmap.containsKey(pattern.charAt(i)) && !hmap.containsValue(str[i]))
            hmap.put(pattern.charAt(i),str[i]);
            else if(hmap.containsKey(pattern.charAt(i)))
            {
                if(!hmap.get(pattern.charAt(i)).equals(str[i]))
                return false;
            }
            else if(hmap.containsValue(str[i]))
            {
                if(!hmap.containsKey(pattern.charAt(i)))
                return false;
            }
        }
        return true;
    }
}