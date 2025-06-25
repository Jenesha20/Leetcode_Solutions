class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        Arrays.sort(nums); 
        back(l, new ArrayList<>(), nums, vis);
        return l;
    }

    public void back(List<List<Integer>> l, List<Integer> temp, int[] nums, boolean[] vis) {
        if (temp.size() == nums.length) {
            l.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) continue;

           
            if (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) continue;

            vis[i] = true;
            temp.add(nums[i]);
            back(l, temp, nums, vis);
            temp.remove(temp.size() - 1);
            vis[i] = false;
        }
    }
}
