class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String>l=new ArrayList<>();
        HashMap<String,Integer>hmap=new HashMap<>();
        String[] s3=s1.split(" ");
        String[] s4=s2.split(" ");
        for(String x:s3)
        {
            hmap.put(x,hmap.getOrDefault(x,0)+1);
        }
        for(String x:s4)
        {
            hmap.put(x,hmap.getOrDefault(x,0)+1);
        }
        for(String x:hmap.keySet())
        {
            if(hmap.get(x)<=1)
            {
                l.add(x);
            }
        }
        String[] res=new String[l.size()];
        int i=0;
        for(String x:l)
        res[i++]=x;
        return res;
    }
}