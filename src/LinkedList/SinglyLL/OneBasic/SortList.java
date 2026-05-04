package LinkedList.SinglyLL.OneBasic;
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortList {
    public static Node main(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node mid = findMiddle(head);

        Node rightNode=mid.next;
        mid.next = null;

        Node left=main(head);
        Node right=main(rightNode);

        return merge(left,right);

    }
    public static Node findMiddle(Node head) {
        Node slow=head;
        Node fast=head.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node left,Node right){
        Node head=new Node(-1);
        Node temp=head;
        while(left!=null&&right!=null){
            if(left.data<right.data){
                temp.next=left;
                left=left.next;
            }else {
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return head.next;
    }
}
