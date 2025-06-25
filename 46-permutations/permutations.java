class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> l=new ArrayList<>();
      back(l,new ArrayList<>(),nums);
      return l;
    }
    public void back(List<List<Integer>> l,List<Integer> temp,int[] nums)
    {
       if(temp.size()==nums.length)
       l.add(new ArrayList<>(temp));
       else
       {
        for(int i=0;i<nums.length;i++)
        {
            if(temp.contains(nums[i]))
            continue;
            temp.add(nums[i]);
            back(l,temp,nums);
            temp.remove(temp.size()-1);
        }
       }
    }
}