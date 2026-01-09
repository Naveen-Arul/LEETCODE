class Solution {
    public String removeStars(String s) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b!='*'){
                sb.append(b);
            }
            else{
                sb.deleteCharAt(sb.length()-1);
            }
       } 
       return sb.toString();

    }
}