class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> l=new ArrayList<>();
        for(int i:score)
        l.add(i);
        Collections.sort(l);
        int x=l.size();
        Collections.sort(l, Collections.reverseOrder());
        String[] s=new String[x];
        for(int i=0;i<l.size();i++)
        {
           if(score[i]==l.get(0))
           s[i]="Gold Medal";
           else if(score[i]==l.get(1))
           s[i]="Silver Medal";
           else if(score[i]==l.get(2))
           s[i]="Bronze Medal";
           else
           {
            int o=(l.indexOf(score[i]))+1;
            s[i]=String.valueOf(o);
           }

        }
        return s;
    }
}