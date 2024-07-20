/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */

// @lc code=start
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i=0; i<sentences.length; i++) {
            String sentence = sentences[i]; // sentence有空白
            int nows = sentence.split(" ").length;
            maxWords = nows > maxWords ? nows : maxWords;
        }
        return maxWords;
    }
}
// @lc code=end

