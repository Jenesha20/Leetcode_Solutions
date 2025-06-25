class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        List<List<Integer>> l=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++)
        nums[j++]=i;
        back(l,new ArrayList<>(),nums,k,0);
        return l;
    }
    public void back(List<List<Integer>> l,List<Integer> temp,int[] nums,int k,int s)
    {
        if(temp.size()==k)
        l.add(new ArrayList<>(temp));
        else
        {
            for(int i=s;i<nums.length;i++)
            {
                temp.add(nums[i]);
                back(l,temp,nums,k,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}