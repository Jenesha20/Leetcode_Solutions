class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character,Integer> hmap=new HashMap<>();
       int c=0,o=0;
       for(char x:s.toCharArray())
       hmap.put(x,hmap.getOrDefault(x,0)+1);
       for(char x:hmap.keySet())
       {
        if(hmap.get(x)%2==0 && hmap.get(x)!=0)
        c+=hmap.get(x);
        else if(hmap.get(x)%2==1 && hmap.get(x)!=1)
        {
            c+=hmap.get(x)-1;
            o=1;
        }
        else
        o=1;
       }
       return c+o;
    }
}