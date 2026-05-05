package LinkedList.SinglyLL.OneBasic.DoublyLL;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Traversal {
    public Node Solution(int[] arr){
        if(arr.length == 0) return null;
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the list: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Traversal tr=new Traversal();
        Node head=tr.Solution(arr);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
