package fastandslowpointers;

import utils.ListNode;

public class LinkedListCycleStart {
    public static ListNode findCycleStart(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        int size = 1;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                ListNode sizePointer = slowPointer.next;
                while (sizePointer != slowPointer) {
                    size++;
                    sizePointer = sizePointer.next;
                }
                break;
            }
        }
        slowPointer = head;
        fastPointer = head;
        while (size > 0) {
            fastPointer = fastPointer.next;
            size--;
        }
        while (fastPointer != slowPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
    }
}
