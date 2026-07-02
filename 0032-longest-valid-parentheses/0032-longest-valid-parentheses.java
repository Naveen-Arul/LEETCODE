class Solution {
    public int longestValidParentheses(String s) {
        int maxLength = 0;
        Stack<Integer> left = new Stack<>();
        left.push(-1); 
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                left.push(i);
            } else {
                left.pop();
                if (left.isEmpty()) {
                    left.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - left.peek());
                }
            }
        }
        return maxLength;
    }

    }
