class Solution {
    public int firstMissingPositive(int[] nums) {
       List<Integer> l = new ArrayList<>();
        // Add all elements from nums to list l
        for (int x : nums) {
            l.add(x);
        }

        // Sort the list
        Collections.sort(l);

        // Handle edge cases for 0 and 1
        if (!l.contains(1)) {
            return 1;
        }

        // Iterate through the sorted list and find the smallest missing positive integer
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) < 1) {
                continue; // Ignore negative numbers and zero
            }
            // If there's a gap between consecutive numbers, return the missing number
            if (l.get(i + 1) - l.get(i) > 1) {
                return l.get(i) + 1;
            }
        }

        // If no missing number is found, return the next number after the largest number in the list
        return l.get(l.size() - 1) + 1;
    }
}