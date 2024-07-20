/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int num = nums[i];
            int dValue = target - num; //差值
            if (map.containsKey(dValue)) {
                return new int[] {map.get(dValue), i};
            }
            map.put(num, i);
        }
        return null;
    }
}
// @lc code=end

