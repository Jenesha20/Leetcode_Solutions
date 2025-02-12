import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        int m = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int sum = 0, n = num;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            if (map.containsKey(sum)) {
                m = Math.max(m, map.get(sum) + num);
                map.put(sum, Math.max(map.get(sum), num));
            } else {
                map.put(sum, num);
            }
        }
        return m;
    }
}
