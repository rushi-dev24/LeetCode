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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode left=head,right=left,prev=dummy;
        while(right!=null){
            while(right.next!=null){
                if(left.val==right.next.val){
                    right=right.next;
                }else{
                    break;
                }
            }
            System.out.println(left==right);
            if(right!=left){
                prev.next=right.next;
            }else{
                prev=prev.next;
            }
            left=right.next;
            right=left;
        }
        return dummy.next;
    }
}

// => Time Complexity = O(n) & Space Complexity = O(1)
