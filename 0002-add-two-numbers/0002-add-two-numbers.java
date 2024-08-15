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
        ListNode res = new ListNode();
        ListNode curr = res; 
        int carry = 0; 

        while(l1!=null || l2!= null || carry !=0){
            int a = 0; 
            int b = 0; 

            if(l1!=null){
                a = l1.val; 
            }

            if(l2!=null){
                b = l2.val;
            }

            int val = a + b + carry; 
            carry = val / 10; 
            val = val % 10; 

            curr.next = new ListNode(val); 
            curr = curr.next; 

            l1 = l1 != null ? l1.next : null; 
            l2 = l2 != null ? l2.next : null;
            
        }
        return res.next;
    }
}