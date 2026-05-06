package LinkedList.SinglyLL.OneBasic.DoublyLL;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Deletion {
    public Node2 DeleteNode(Node2 head,int pos){
        if(head==null){
            return head;
        }
        Node2 curr=head;
        for(int i=1;curr!=null&&i<pos;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        if(curr.prev==null){
            curr.prev.next=curr.next;
        }
        if(curr.next==null){
            curr.next.prev=curr.prev;
        }
        if(head==curr){
            head=curr.next;
        }
        return head;
    }
    public Node2 DeleteNodeAtBegining(Node2 head){
        if(head==null){
            return null;
        }
        Node2 temp = head;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        return head;
    }
    public Node2 DeleteNodeAtEnd(Node2 head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node2 temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.prev!=null){
            temp.prev.next=null;
        }
        return head;
    }
    public Node2 deleteAfter(Node2 head,int key){
        Node2 curr=head;
        while (curr!=null){
            if(curr.data==key){
                break;
            }
            curr=curr.next;
        }
        if(curr==null||curr.next==null){
            return head;
        }
        Node2 deleteNode =curr.next;
        curr.next=deleteNode.next;
        if(deleteNode.next!=null){
            deleteNode.next.prev=curr;
        }
        return head;

    }
    public Node2 deleteBefore(Node2 head,int key){
        Node2 curr=head;
        while (curr!=null){
            if(curr.data==key){
                break;
            }
            curr=curr.next;
        }
        if(curr==null||curr.next==null){
            return head;
        }
        Node2 deleteNode =curr.next;
        curr.prev=deleteNode.prev;
        if(deleteNode.prev!=null){
            deleteNode.prev.next=curr;
        }else {
            head=curr;
        }
        return head;
    }

}
