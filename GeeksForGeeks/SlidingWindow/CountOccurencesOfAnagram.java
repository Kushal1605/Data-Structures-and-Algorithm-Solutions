/*
 * https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
 */

class Solution {
    int search(String pat, String txt) {
        int [] freq = new int [26];
        int [] freqOfPat = new int [26];
        for(int i = 0; i < pat.length(); i++) 
            freqOfPat[pat.charAt(i) - 97] += 1;
        int start = 0, end = 0, occurrence = 0;
        StringBuilder temp = new StringBuilder();
        while(end < txt.length()) {
            temp.append(txt.charAt(end));
            freq[txt.charAt(end) - 97] += 1;
            if(end - start + 1 == pat.length()) {
                if(Arrays.compare(freq, 0 , 26, freqOfPat, 0, 26) == 0)
                    occurrence += 1;
                freq[temp.charAt(0) - 97] -= 1;
                temp.deleteCharAt(0);
                start += 1;
            }
            end += 1;
        }
        return occurrence;
    }
}
