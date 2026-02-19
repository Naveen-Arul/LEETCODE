class Solution {
    public int countBinarySubstrings(String s) {
        int prevCount = 0;
        int currCount = 1;
        int result = 0;
        // Iterate through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                // Increment current count if the same as previous character
                currCount++;
            } else {
                // If different, compare counts and add to result
                result += Math.min(prevCount, currCount);
                // Reset previous count to current count and reset current count
                prevCount = currCount;
                currCount = 1;
            }
        }
        // Final comparison for the last sequence
        result += Math.min(prevCount, currCount);
        return result;
    }
}