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
    ListNode jode=head;
    while(jode!=null){
        ListNode nextnode=jode.next;
        jode.next=prevnode;
        prevnode=jode;
        jode=nextnode;
    }
    return prevnode;
    }
}