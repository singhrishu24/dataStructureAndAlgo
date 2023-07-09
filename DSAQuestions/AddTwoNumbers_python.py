class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1, l2):
        dummyHead = ListNode(0)
        current = dummyHead
        carry = 0

        while l1 is not None or l2 is not None:
            sum_val = carry

            if l1 is not None:
                sum_val += l1.val
                l1 = l1.next

            if l2 is not None:
                sum_val += l2.val
                l2 = l2.next

            carry = sum_val // 10
            current.next = ListNode(sum_val % 10)
            current = current.next

        if carry > 0:
            current.next = ListNode(carry)

        return dummyHead.next

# Driver Code
# Create Linked List l1: 2 -> 4 -> 3
l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

# Create Linked List l2: 5 -> 6 -> 4
l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

# Add two numbers and print result
solution = Solution()
result = solution.addTwoNumbers(l1, l2)
while result is not None:
    print(result.val, end=" ")
    result = result.next
