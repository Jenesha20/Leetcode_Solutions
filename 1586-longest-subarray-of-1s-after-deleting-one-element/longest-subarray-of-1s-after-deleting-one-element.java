class Solution {
    public int longestSubarray(int[] nums) {
        int c = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                c++;
        }

        
        if (c == 0)
        return nums.length - 1;

        int k = 0;
        int[] n = new int[c];

        for (int i = 0; i < nums.length; i++) {
            int l = i - 1;
            int r = i + 1;
            int x = 0, y = 0;

            if (nums[i] == 0) {
                
                while (l >= 0 && nums[l] == 1) {
                    x++;
                    l--;
                }

                
                while (r < nums.length && nums[r] == 1) {
                    y++;
                    r++;
                }

                
                n[k++] = x + y;
            }
        }

        int m = 0;
        for (int i = 0; i < n.length; i++) {
            m = Math.max(m, n[i]);
        }

        return m;
    }
}
