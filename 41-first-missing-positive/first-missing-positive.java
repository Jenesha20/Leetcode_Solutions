class Solution {
    public int firstMissingPositive(int[] nums) {
       List<Integer> l=new ArrayList<>();
       int s=0;
       for(int x:nums)
       l.add(x);
       Collections.sort(l);
       if(!l.contains(1))
       return 1; 
       for(int i=0;i<l.size()-1;i++)
       {
        if(l.get(i)<0)
        continue;
        if(l.get(i+1)-l.get(i)>1)
        {
            return l.get(i)+1;
            //break;
        }
       }
       return l.get(l.size()-1)+1;
    }
}