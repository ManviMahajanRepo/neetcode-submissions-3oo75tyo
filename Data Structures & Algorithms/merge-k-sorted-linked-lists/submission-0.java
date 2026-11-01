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

        PriorityQueue<ListNode> minheap = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode lst:lists){
            if(lst != null){
                minheap.offer(lst);
            }
            
        }

        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(!minheap.isEmpty()){

          ListNode node = minheap.poll();
          curr.next = node;
          curr = curr.next;

          node = node.next;
          if(node != null){
            minheap.offer(node);
          }

        }

        return res.next;


    }
}
