package LinkedList.SinglyLL.OneBasic.DoublyLL;
class Node4{
    int data;
    Node4 next;
    Node4 prev;
    Node4(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}
public class InsertionAtPos {
    public Node4 insert(Node4 head,int data,int pos){
        Node4 newNode=new Node4(data);
        if(head==null){return newNode;}
        Node4 temp=head;
        for(int i=0;i<pos&&temp.next!=null;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next==null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
        return head;
    }
    
}
