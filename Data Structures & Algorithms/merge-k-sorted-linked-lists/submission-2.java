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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        PriorityQueue<ListNode> min= new PriorityQueue<>((a,b)->a.val - b.val);
        
        ListNode res = new ListNode(0);
        ListNode curr = res;

        for(ListNode list: lists){
            if(list!=null){
                min.offer(list);
            }
        }

        while(!min.isEmpty()){
            ListNode node = min.poll();
            curr.next = node;
            curr = curr.next;
            node = node.next;
            if(node!=null){
                min.offer(node);
            }
        }

        return res.next;

    }
}
