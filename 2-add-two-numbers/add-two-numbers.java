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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int carry=0;
       ListNode l3=new ListNode(0);
       ListNode head=l3;

       while(l1!=null || l2!=null)
       {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            l3.next = new ListNode(sum % 10);
            l3 = l3.next; // Move to the next node

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
         
       }

       if(carry>0){
        l3.next=new ListNode(carry);
       }

       return head.next; //As in starting given newNode(0) i.e head as 0
    }
}