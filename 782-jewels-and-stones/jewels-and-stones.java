class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashMap<Character,Integer> hmap1=new HashMap<>();
      HashMap<Character,Integer> hmap2=new HashMap<>();
      char[] c1=jewels.toCharArray();
      char[] c2=stones.toCharArray();
      for(Character x:c1)
      hmap1.put(x,hmap1.getOrDefault(x,0)+1);
      for(Character x:c2)
      hmap2.put(x,hmap2.getOrDefault(x,0)+1);
      int s=0;
      for(Character x:c1)
      {
        if(hmap2.containsKey(x))
        {
            s+=hmap2.get(x);
        }
      } 
      return s; 
    }
}