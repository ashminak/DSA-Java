package LinkedList.SinglyLL.OneBasic.SlowAndFast;

import org.w3c.dom.Node;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int d){
        data=d;
        next=null;
    }
}

public class RemoveNthNodeFromEnd {
    public Node1  removeNthFromEnd(Node1 head, int n) {
        Node1 slow = head;
        Node1 fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (head==null){
            return head.next;
        }
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        Node1 head = new Node1(arr[0]);
        Node1 temp = head;
        for (int i = 1; i < t; i++) {
            temp.next = new Node1(arr[i]);
            temp = temp.next;
        }
        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
        head=obj.removeNthFromEnd(head, n);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
