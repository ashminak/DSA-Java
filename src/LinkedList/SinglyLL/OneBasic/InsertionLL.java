package LinkedList.SinglyLL.OneBasic;//package LinkedList.SinglyLL.OneBasic;


//public class LLInsertionAtEnd {
//    public Node insert(Node head, int data) {
//        if(head == null) return new Node(data);
//        Node temp = head;
//        while(temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = new Node(data);
//        return head;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of nodes: ");
//        int n = sc.nextInt();
//        LLInsertionAtEnd ll = new LLInsertionAtEnd();
//        Node head = null;
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter the value of node "+i+": ");
//            int data = sc.nextInt();
//            head= ll.insert(head,data);
//        }
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//    }
//}
//class Node{
//    int data;
//    Node next;
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}


import org.w3c.dom.Node;
class Node4 {
    int data;
    Node4 next;

    public Node4(int data) {
        this.data = data;
        this.next = null;
    }
}

//public class LLInsertionAtEnd {
//    public Node4 insertionAtBeginning(Node4 head, int insertVal) {
//        Node4 temp = new Node4(insertVal);
//        temp.next=head;
//        return temp;
//
//    }
//}

//public class LLInsertionAtEnd {
//    public Node4 insertAtPosition(Node4 head, int data,int position) {
//        if(position==1){
//            Node4 temp = new Node4(data);
//            temp.next = head;
//            return temp;
//        }
//        Node4 temp = head;
//        for(int i=1;i<position-1&&temp!=null;i++){
//            temp = temp.next;
//        }
//        if(temp!=null){
//            Node4 temp1 = temp.next;
//            temp1.next = temp.next;
//            temp.next = temp1;
//        }
//        return head;
//    }
//}

public class InsertionLL {
    public Node4 insertBeforeValue(Node4 head, int data,int value) {
        if(head == null) {
            return null;
        }
        if(head.data==value){
            Node4 temp = new Node4(data);
            temp.next = head;
            head = temp;
            return temp;
        }
        Node4 temp = head;
        while (temp.next != null&&temp.next.data!=value) {
            temp = temp.next;
        }
        if(temp.next!=null) {
            Node4 temp2 = new Node4(temp.next.data);
            temp2.next = temp.next.next;
            temp.next = temp2;
        }
        return head;
    }
}



