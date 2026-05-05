package LinkedList.SinglyLL.OneBasic.SlowAndFast;
class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;
        this.next=null;
    }
}
public class addTwoNum {
    Node5 reverse(Node5 head){
        Node5 prev=null;
        Node5 curr=head;
        while(curr!=null){
            Node5 next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node5 Solution(Node5 head1,Node5 head2) {
        int carry=0;
        head1=reverse(head1);
        head2=reverse(head2);

        Node5 dummy = new Node5(0);
        Node5 temp = dummy;
        while(head1!=null&&head2!=null||carry!=0){
            int sum =0;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            sum+=carry;
            carry=sum/10;
            temp.next= new Node5(sum%10);
            temp=temp.next;
        }
        Node5 result = reverse(dummy.next);
        while(result==null||result.data!=0){
            result=result.next;
        }
        return result==null? new Node5(0):result;
    }
}
