public class Search {
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static int findmax(Node head) {
      int max=head.data;
      Node current=head.next;
      while(current != null){
        if(current.data>max){
          max=current.data;
        }
        current=current.next;
      }
      return max;
  }
  public static void main(String[] args) {
      Node head = new Node(7);
      head.next=new Node(14);
      head.next.next=new Node(21);
      head.next.next.next=new Node(28);
      head.next.next.next.next=new Node(100);
      int max = findmax(head);
      System.out.println("maximum element: " + max);
  }
}
