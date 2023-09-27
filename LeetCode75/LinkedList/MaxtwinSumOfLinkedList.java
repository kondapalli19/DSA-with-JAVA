https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75
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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode next=slow.next;
        ListNode prev=null;
        while(slow!=null){
            slow.next=prev;
            prev=slow;
            slow=next;
            if(next!=null){
                next=next.next;
            }
        }
        int maxVal=0;
        while(prev!=null){
            maxVal=Math.max(maxVal, head.val + prev.val);
            prev=prev.next;
            head=head.next;
        }
        return maxVal;
    }
}
