class Solution {
    public boolean search(int[] nums, int target) {
        List<Integer> l=new ArrayList<>();
        for(int x:nums)
        l.add(x);
        if(l.contains(target))
        return true;
        else
        return false;
    }
}