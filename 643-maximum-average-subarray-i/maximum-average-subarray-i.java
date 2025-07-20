class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int sum = 0;
    
    // 1. Sum of first k elements
    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }

    int maxSum = sum;

    // 2. Slide the window
    for (int i = k; i < nums.length; i++) {
        sum = sum - nums[i - k] + nums[i]; // Remove leftmost, add new
        if (sum > maxSum) {
            maxSum = sum;
        }
    }

    // 3. Return the average
    return (double) maxSum / k;
    }
}