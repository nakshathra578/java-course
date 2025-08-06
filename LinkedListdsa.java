class Node {
    String data;
    Node next;
    Node(String data) {  
        this.data = data;
        this.next = null;
    }
}
class Reverserecursive {
    Node head;
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public int getSizeRecursive() {
        return getSizeRecursiveHelper(head);
    }
    private int getSizeRecursiveHelper(Node node) {
        if (node == null) return 0;
        return 1 + getSizeRecursiveHelper(node.next);
    }
    public void printList() {
        Node current = head;
        System.out.println("This is a linked list:");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void printListRecursive() {
        System.out.println("This is a linked list (recursive):");
        printListRecursiveHelper(head);
        System.out.println("null");
    }
    private void printListRecursiveHelper(Node node) {
        if (node == null) return;
        System.out.print(node.data + " -> ");
        printListRecursiveHelper(node.next);
    }
}
public class LinkedListdsa {
    public static void main(String[] args) {
        Reverserecursive list = new Reverserecursive();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("LL");
        System.out.println("Size (iterative): " + list.getSize());
        list.printList();
        list.deleteFirst();
        list.printList();
        System.out.println("Size (iterative): " + list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println("Size (iterative): " + list.getSize());
        System.out.println("Size (recursive): " + list.getSizeRecursive());
        list.printListRecursive();
    }
}