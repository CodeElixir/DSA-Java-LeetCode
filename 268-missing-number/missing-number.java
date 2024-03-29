class Solution {
    public int missingNumber(int[] nums) {
        // Using sum

        // int n = nums.length;
        // int targetSum = (n * (n + 1)) / 2;
        // int sum = Arrays.stream(nums).sum();
        // return targetSum - sum;

        // Using bitwise
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ (i + 1) ^ nums[i];
        }
        return res;
    }
}