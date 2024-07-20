/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (i>0) {
                result[i] = result[i-1] + nums[i];
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}
// @lc code=end

