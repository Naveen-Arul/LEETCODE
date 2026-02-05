class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        // count frequency of each task
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        // find maximum frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }
        // count how many tasks have max frequency
        int countMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                countMax++;
            }
        }
        // formula
        int intervals = (maxFreq - 1) * (n + 1) + countMax;
        // answer is max of total tasks or calculated intervals
        return Math.max(tasks.length, intervals);
    }
}