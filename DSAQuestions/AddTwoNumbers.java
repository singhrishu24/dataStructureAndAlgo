//Add two linked lists and return the result as a linked list. Here value is like 2->4->3 is 342.
//Time Complexity : O(max(m,n))
//Space Complexity : O(max(m,n))
class ListNode {
    int val;    // value of node
    ListNode next;  // pointer to next node

    ListNode(int val) // constructor
    {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);   // dummy head node
        ListNode current = dummyHead;   // current node
        int carry = 0;  // initialize carry value

        // iteration through both lists
        while (l1 != null || l2 != null) {
            int sum = carry;   // initialize sum to carry value

            // if l1 is not null, add its value to sum
            if (l1 != null) {
                sum += l1.val; // add value of l1 to sum
                l1 = l1.next; // move to next node in l1
            }

            // if l2 is not null, add its value to sum
            if (l2 != null) {
                sum += l2.val; // add value of l2 to sum
                l2 = l2.next; // move to next node in l2
            }

            carry = sum / 10; // update carry value
            current.next = new ListNode(sum % 10); // create new node with remainder of sum
            current = current.next; // move to next node
        }

        // if carry is not 0, create new node with carry value
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // return dummyHead.next
    }
}

// Driver Code
public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create Linked List l1 : 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create Linked List l2 : 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add two numbers and print result
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
