class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> original=new ArrayList<>();
        List<Integer> reversed=new ArrayList<>();
        if(head==null || head.next==null){
            return true; 
        }
        while(head!=null){
            original.add(head.val);
            head=head.next;
        }
        for(int i=original.size()-1;i>=0;i--){
            reversed.add(original.get(i));
        }
        return original.equals(reversed);
    }
}