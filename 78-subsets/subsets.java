class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        create(nums,res,new ArrayList<>(),0);
        return res;
    }
    public static void create(int[] nums,List<List<Integer>> res,List<Integer> l,int index)
    {
       if(index==nums.length)
       res.add(new ArrayList<>(l));
       else
       {
        l.add(nums[index]);
        create(nums,res,l,index+1);
        l.remove(l.size()-1);
        create(nums,res,l,index+1);
       }
    }
}