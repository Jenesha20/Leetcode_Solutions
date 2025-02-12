class Solution {
    public int maximumSum(int[] nums) {
        int m=-1;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int x:nums)
        {
            int s=0;
            int n=x;
            while(n!=0)
            {
                s+=n%10;
                n/=10;
            }
            if(hmap.containsKey(s))
            {
                m=Math.max(m,hmap.get(s)+x);
                hmap.put(s,Math.max(hmap.get(s),x));
            }
            else
            {
                hmap.put(s,x);
            }
        }
      return m;
    }
}