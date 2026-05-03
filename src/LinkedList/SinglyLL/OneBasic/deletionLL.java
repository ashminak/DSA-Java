package LinkedList.SinglyLL.OneBasic;
class Node5{
    int data;
    Node5 next;
    Node5(int d){
        data=d;
        next=null;
    }

}

public class deletionLL {
    public Node5 deleteAtBeginning(Node5 head) {
        head=head.next;
        return head;
    }
    public Node5 deleteAtEnd(Node5 head) {
        if(head==null||head.next==null) {
            return null;
        }
        Node5 temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public Node5 deleteValue(Node5 head,int value) {
        if(head==null)return null;
        if(head.data==value){
            return head.next;
        }
        Node5 temp=head;
        Node5 prev=null;
        while (temp!=null) {
            if(temp.data==value){
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public Node5 deleteAtPos(Node5 head,int pos) {
        if(head==null)return null;
        if(head.data==pos){
            return head.next;
        }
        Node5 temp=head;
        Node5 prev=null;
        int count=0;
        while (temp!=null&&count<pos) {
                prev=temp;
                temp=temp.next;
                count++;
        }
        if(count==pos){
            prev.next=temp.next;
        }
        return head;
    }
}


