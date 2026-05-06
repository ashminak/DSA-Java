package LinkedList.SinglyLL.OneBasic.DoublyLL;
class Node1 {
    int data;
    Node1 next;
    Node1 prev;
    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
public class Reverse {
    public Node1 Reverse(Node1 head) {
        if (head == null||head.next==null) {
            return head;
        }
        Node1 temp = head;
        Node1 back = null;
        while (temp != null) {
            back = temp.prev;
            temp.prev = temp.next;
            temp.next = back;
            temp=temp.prev;
        }
        return back.prev;
    }
}
