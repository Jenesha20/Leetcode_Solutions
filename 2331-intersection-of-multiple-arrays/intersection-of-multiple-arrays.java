class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> hmap=new HashMap<>();
        if (nums.length == 0 || nums[0].length == 0) 
        return l;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(hmap.containsKey(nums[i][j]))
                {
                    hmap.put(nums[i][j],hmap.getOrDefault(nums[i][j],0)+1);
                }
                else
                {
                    hmap.put(nums[i][j],1);
                }
            }
        }
        for(int x:hmap.keySet())
        {
            if(hmap.get(x)==nums.length)
            {
                l.add(x);
            }
        }
        Collections.sort(l);
        return l;
    }
}