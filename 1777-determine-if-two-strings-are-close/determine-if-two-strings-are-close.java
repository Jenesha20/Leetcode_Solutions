class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        return false;
        HashMap<Character,Integer> hmap1=new HashMap<>();
        HashMap<Character,Integer> hmap2=new HashMap<>();
        for(char c:word1.toCharArray())
        hmap1.put(c,hmap1.getOrDefault(c,0)+1);
        for(char c:word2.toCharArray())
        hmap2.put(c,hmap2.getOrDefault(c,0)+1);
        if(!hmap1.keySet().equals(hmap2.keySet()))
        return false;
        List<Integer> l1=new ArrayList<>(hmap1.values());
        List<Integer> l2=new ArrayList<>(hmap2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}