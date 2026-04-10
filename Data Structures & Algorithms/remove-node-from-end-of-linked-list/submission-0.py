# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        #basically we will maintain gap between left and right pointer
        #with right pointer reaching the end and maintaining a gap of n nodes
        #position of left node will be the node to remove
        #we put this in a dummy node
        #we use slow and fast pointer when we want to detect cycle or 
        # get to middle
        #here we used 2 pointer because we want left and right to move at 
        #same pace unlike slow and fast

        dummy = ListNode(0,head)
        left = dummy
        right = head

        while n > 0:
            right = right.next
            n -=1

        while right:
            left = left.next
            right = right.next

        left.next = left.next.next #we will jump over the node we 
        #want to remove.This is called de-referencing
        return dummy.next 