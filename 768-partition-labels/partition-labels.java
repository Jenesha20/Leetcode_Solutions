class Solution {
    public List<Integer> partitionLabels(String s) {
       List<Integer> l=new ArrayList<>();
       HashMap<Character,Integer> hmap=new HashMap<>();
       for(int i=0;i<s.length();i++)
       hmap.put(s.charAt(i),i);
       int st=0,e=0;
       for(int i=0;i<s.length();i++)
       {
        e=Math.max(e,hmap.get(s.charAt(i)));
        if(i==e)
        {

           l.add(e-st+1);
           st=i+1;
        }
       }
       return l;
    }
}