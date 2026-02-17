class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        // Loop through all possible hours
        for (int hour = 0; hour < 12; hour++) {
            // Loop through all possible minutes
            for (int minute = 0; minute < 60; minute++) {
                // Count total number of 1 bits
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    // Format minute with leading zero if needed
                    String time = String.format("%d:%02d", hour, minute);
                    result.add(time);
                }
            }
        }
        return result;
    }
}
