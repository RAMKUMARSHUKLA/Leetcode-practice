/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode pleft;
    public boolean isPalindrome(ListNode head) {
      pleft=head;
      return isPalindromeHelper(head);
        
    }
    
    public boolean isPalindromeHelper(ListNode right)
    {
        if(right==null)
        {
            return true;
        }
        boolean rresult=isPalindromeHelper(right.next);
        if(rresult==false)
        {
            return false;
        }
        else if(pleft.val!=right.val)
        {
            return false;
        }
        else
        {
            pleft=pleft.next;
            return true;
        }
        
    }
}