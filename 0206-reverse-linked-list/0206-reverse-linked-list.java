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
    public ListNode reverseList(ListNode head) {
    ListNode prevnode=null;
    ListNode node=head;
    while(node!=null){
        ListNode nextnode=node.next;
        node.next=prevnode;
        prevnode=node;
        node=nextnode;
    }
    return prevnode;
    }
}