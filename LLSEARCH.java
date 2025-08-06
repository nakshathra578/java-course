public class LLSEARCH {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void search(Node head, int key) {
    Node current = head;
    while (current != null) {
      if (current.data == key) {
        System.out.println("Key element found: " + key);
        return;
      }
      current = current.next;
    }
    System.out.println("Key element not found");
  }

  public static void main(String[] args) {
    Node head = new Node(7);
    head.next = new Node(14);
    head.next.next = new Node(21);
    head.next.next.next = new Node(28);

    int key = 1;
    search(head, key);
  }
}
