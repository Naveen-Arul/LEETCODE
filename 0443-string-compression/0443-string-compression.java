class Solution {
    public int compress(char[] chars) {
        int i=0;
        String res="";
        int index=0;
        int n=chars.length;
        while(i<n){
            int count=0;
            char curr=chars[i];
            while(i<n && chars[i]==curr){
                count++;
                i++;
            }
            chars[index++]=curr;
            if(count>1) 
            {
                String c=String.valueOf(count);
                for(int j=0;j<c.length();j++){
                    chars[index++]=c.charAt(j);
                }
            }
        }
        return index;
    }
}