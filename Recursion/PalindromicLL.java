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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left=head;
        return isPalindromeRec(head);
    }
    public boolean isPalindromeRec(ListNode head){
        if(head == null)return true;
        boolean isMatch=isPalindromeRec(head.next);
        if(!isMatch)return false;
        boolean match=left.val==head.val;
        left=left.next;
        return match;
    }
}
