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
    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        ListNode curr=head,last=head,prevHead=head;
        while(curr!=null){
            size++;
            last=curr;
            curr=curr.next;
        }
        if(size==0 || size==1 || k==0)return head;
        long rshift=(long)k%size,currPos=1;
        if(rshift==0)return head;
        curr=head;
        ListNode prev=null;
        while(curr!=null){
            if(currPos==size-rshift+1){
                head=curr;
                break;
            }
            currPos++;
            prev=curr;
            curr=curr.next;
        }
        if(prev!=null)prev.next=null;
        last.next=prevHead;
        return head;
    }
}
