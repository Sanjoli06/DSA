class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep = 0;
        int miss = 0;

        // Step 1: find duplicate
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val - 1] < 0) {
                rep = val;
            } else {
                nums[val - 1] = -nums[val - 1];
            }
        }

        // Step 2: find missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                miss = i + 1;
                break;
            }
        }

        return new int[]{rep, miss};
    }
}
