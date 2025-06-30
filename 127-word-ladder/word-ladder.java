class Solution {
    class Pair
    {
        String s;
        int n;
        Pair(String s,int n)
        {
            this.s=s;
            this.n=n;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        for(String x:wordList)
        set.add(x);
        set.remove(beginWord);
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            String f=p.s;
            int s=p.n;
            if(f.equals(endWord))
            return s;
            for(int i=0;i<f.length();i++)
            {
                for(char c='a';c<='z';c++)
                {
                    char[] rep=f.toCharArray();
                    rep[i]=c;
                    String repw=new String(rep);
                    if(set.contains(repw))
                    {
                        set.remove(repw);
                        q.add(new Pair(repw,s+1));

                    }
                }
            }
        }
        return 0;
    }
}