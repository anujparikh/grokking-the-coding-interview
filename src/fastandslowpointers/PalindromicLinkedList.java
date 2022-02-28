package fastandslowpointers;

import utils.ListNode;

public class PalindromicLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode middleNode = findMiddle(head);
        middleNode.next = reverseLinkedList(middleNode.next);
        ListNode startPointer = head;
        ListNode middlePointer = middleNode.next;
        while (middlePointer != null) {
            if (startPointer.value != middlePointer.value) {
                return false;
            }
            startPointer = startPointer.next;
            middlePointer = middlePointer.next;
        }
        middleNode.next = reverseLinkedList(middleNode.next);
        return true;
    }

    static ListNode findMiddle(ListNode input) {
        ListNode slow = input;
        ListNode fast = input;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    static ListNode reverseLinkedList(ListNode input) {
        ListNode previous = null;
        ListNode next;
        ListNode current = input;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));

        head.next.next.next.next.next = new ListNode(2);
        System.out.println("Is palindrome: " + PalindromicLinkedList.isPalindrome(head));
    }
}
