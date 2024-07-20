/*
 * @lc app=leetcode id=1662 lang=java
 *
 * [1662] Check If Two String Arrays are Equivalent
 */

// @lc code=start
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word1String = String.join("", word1);
        String word2String = String.join("", word2);
        return word1String.equals(word2String);
    }
}
// @lc code=end

