class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;
        
        // Traverse from right to left (ignore the first bit because we stop at "1")
        for (int i = s.length() - 1; i > 0; i--) {
            int bit = s.charAt(i) - '0';
            
            if (bit + carry == 1) {
                // Odd → need 2 operations: add 1 (carry) + divide by 2
                count += 2;
                carry = 1; // propagate carry to the left
            } else {
                // Even → just divide by 2
                count += 1;
                // carry remains the same
            }
        }
        
        // Finally, if there's a carry left at the most significant bit
        return count + carry;
    }
}