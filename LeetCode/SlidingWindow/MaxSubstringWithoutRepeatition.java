/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxSize = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right ++) {
            if(!set.contains(s.charAt(right))) { 
                set.add(s.charAt(right));
                maxSize = Math.max(maxSize, right - left + 1);
            } else {
                while(s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left += 1;
                }
                left += 1;
            }
        }
        return maxSize;
    }
}
