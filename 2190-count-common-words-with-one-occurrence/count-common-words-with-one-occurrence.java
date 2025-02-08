class Solution {
    public int countWords(String[] words1, String[] words2) {
       int c=0;
       List<String>l=new ArrayList<>();
       HashMap<String,Integer>w1=new HashMap<>();
       HashMap<String,Integer>w2=new HashMap<>();
       for(String x:words1)
       w1.put(x,w1.getOrDefault(x,0)+1);
       for(String x:words2)
       w2.put(x,w2.getOrDefault(x,0)+1);
       for(String x:w1.keySet())
       {
        if(w1.get(x)==1)
        {
            l.add(x);
        }
       }
       for(String x:l)
       {
        if(w2.containsKey(x))
        {
        if(w2.get(x)==1)
        c++;
        }
       }
       return c;
    }
}