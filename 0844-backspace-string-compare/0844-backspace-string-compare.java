class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=new Stack<>();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c!='#')
            {
                ss.push(c);
            }
            else if(!ss.isEmpty()){
                ss.pop();
            }
        }
        for(char c:t.toCharArray())
        {
            if(c!='#')
            {
                st.push(c);
            }
            else if(!st.isEmpty()){
                st.pop();
            }
        }
        return ss.equals(st);
    }
}