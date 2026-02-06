class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }
        // Step 2: Reverse the cleaned string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
        // Step 3: Compare
        return cleaned.equals(reversed);
    }
}
