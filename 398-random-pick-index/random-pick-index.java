class Solution {
    private int[] n;
    private Random r;
    public Solution(int[] nums) {
        this.n=nums;
        this.r=new Random();
    }
    
    public int pick(int target) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==target)
            {
                l.add(i);
            }
        }
        int index=r.nextInt(l.size());
        return l.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */