class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer> l=new ArrayList<>();
       boolean[] is=new boolean[nums.length];
       for(int i=0;i<nums.length;i++)
       is[nums[i]-1]=true;
       for(int i=0;i<is.length;i++)
       {
        if(!is[i])
        l.add(i+1);
       }
       return l;
       
    }
}