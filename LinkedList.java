public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insertFirst(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = list.head;
        list.head = new_node;
        return list;
    }

    public static LinkedList insertLast(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static LinkedList deleteFirst(LinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty, can't delete any elements!");
            return list;
        }
        list.head = list.head.next;
        return list;
    }

    public static LinkedList deleteLast(LinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty, can't delete any elements!");
            return list;
        }
        if (list.head.next == null) {
            list.head = null;
            return list;
        }
        Node curr = list.head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return list;
    }

    public static void printList(LinkedList list) {
        Node curr = list.head;
        System.out.print("\nLinked List:\n");
        if (curr == null) {
            System.out.println("No nodes in LL");
        }
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void search(LinkedList list, int data) {
        Node curr = list.head;
        int count = 1;
        while (curr != null) {
            if (curr.data == data) {
                System.out.println("\n" + data + " found at position - " + count);
                return;
            }
            curr = curr.next;
            count++;
        }
        System.out.println("\nElement not found!");
    }

    public static int size(LinkedList list) {
        Node curr = list.head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static LinkedList reverse(LinkedList list) {
        Node curr = list.head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        return list;
    }

    public static LinkedList insertAt(LinkedList list, int pos) {
        // To be implemented
        return list;
    }

    public static LinkedList deleteAt(LinkedList list, int pos) {
        // To be implemented
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insertFirst(list, 10);
        printList(list);
        list = insertLast(list, 20);
        printList(list);
        list = insertLast(list, 30);
        printList(list);
        list = insertFirst(list, 40);
        printList(list);
        System.out.println("\nSize of the LL: " + size(list));
        search(list, 30);
        list = deleteFirst(list);
        printList(list);
        list = deleteLast(list);
        printList(list);
    }
}