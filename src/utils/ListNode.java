package utils;

public class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    // Function to insert node
    static ListNode insert(ListNode root, int item) {
        ListNode temp = new ListNode(item, null);
        ListNode ptr;

        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    static void display(ListNode root) {
        while (root != null) {
            System.out.print(root.value + " ");
            root = root.next;
        }
    }

    static ListNode arrayToList(int arr[], int n) {
        ListNode root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }
}
