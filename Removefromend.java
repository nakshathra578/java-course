class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Removefromend{

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        
        ListNode fast = dummy;
        ListNode slow = dummy;


        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        System.out.print("Original List: ");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.print("After Removal: ");
        printList(head);
    }
}



