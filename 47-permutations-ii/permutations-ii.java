class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums); 
        back(l, new ArrayList<>(), nums, visited);
        return l;
    }

    public void back(List<List<Integer>> l, List<Integer> temp, int[] nums, boolean[] visited) {
        if (temp.size() == nums.length) {
            l.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

           
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            temp.add(nums[i]);
            back(l, temp, nums, visited);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
