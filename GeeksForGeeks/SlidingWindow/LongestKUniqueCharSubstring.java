/*
 * https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
 */

class Solution {
    public int longestkSubstr(String s, int k) {
        int start = 0, end = 0, maxSize = -1;
        Map<Character, Integer> map = new HashMap<>();
        while(end < s.length()) {
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
            if(map.size() > k) {
                while(map.size() > k) {
                    map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                    if(map.get(s.charAt(start)) == 0)
                        map.remove(s.charAt(start));
                        start += 1;
                }
            }
            if(map.size() == k) {
            maxSize = Math.max(maxSize, end - start + 1);
            }
            end += 1;
        }
        return maxSize;
    }
}
