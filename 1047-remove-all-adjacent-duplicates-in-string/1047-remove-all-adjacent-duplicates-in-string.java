class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ss=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!ss.isEmpty() && c==ss.peek())
            {
                ss.pop();
            }
            else{
                ss.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:ss)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}