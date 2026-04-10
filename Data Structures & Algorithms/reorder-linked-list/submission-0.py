# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:

        slow,fast = head,head.next #algo for reaching the middle of Linked List
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        second = slow.next
        slow.next = prev = None
        while second: #iterative way to reverse a linked list. Continue until all nodes are exhausted
            tmp = second.next #save the next node before we lose it
            second.next = prev #reverse the pointer. Point backwards
            prev = second #move previous forward
            second = tmp #move second forward
            #prev = None
            #second → 4 → 5 → None
            #tmp = second.next      # tmp = 5
            #second.next = prev     # 4.next = None
            #prev = second          # prev = 4
            #second = tmp           # second = 5

        #first → 1 → 2 → 3 → None
        #second → 5 → 4 → None

        first,second = head,prev
        while second:
            tmp1,tmp2 = first.next, second.next
            first.next = second
            second.next = tmp1
            first,second = tmp1,tmp2

        #tmp1 = 2, tmp2 = 4           # Save the next nodes
        #first.next = second          # 1 → 5
        #second.next = tmp1           # 5 → 2
        #first = 2, second = 4        # Move pointers


        
        