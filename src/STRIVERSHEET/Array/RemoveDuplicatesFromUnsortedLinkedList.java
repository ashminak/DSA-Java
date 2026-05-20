package STRIVERSHEET.Array;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Scanner;

class Node1{
    Node1 next;
    int data;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class RemoveDuplicatesFromUnsortedLinkedList {
    public Node1  removeDuplicates(Node1 head) {
        if (head == null || head.next==null) {return head;}
        HashSet<Integer> set = new HashSet<>();
        Node1 curr = head;
        Node1 prev = head;
        Node1 begin = null;
        while (curr!= null) {
            if(!set.contains(curr.data)) {
                prev.data = curr.data;
                begin = prev;
                prev=prev.next;
                set.add(curr.data);

            }
            curr = curr.next;
        }

        begin.next=null;
        return head;
    }
    public static void printList(Node1 head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Nodes: ");
        int n = sc.nextInt();
        if(n==0){
            return;
        }
        System.out.println("Enter Linked List elements : ");
        Node1 head = new Node1(sc.nextInt());
        Node1 temp = head;
        for(int i=1;i<n;i++){
            temp.next=new Node1(sc.nextInt());
            temp = temp.next;
        }
        RemoveDuplicatesFromUnsortedLinkedList obj = new RemoveDuplicatesFromUnsortedLinkedList();
        head=obj.removeDuplicates(head);
        System.out.println("Linked List after removing duplicates : ");
        printList(head);

    }
}
