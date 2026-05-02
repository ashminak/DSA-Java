package LinkedList.SinglyLL.OneBasic;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
 class Solution {
    public Node traverse(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
public  class Traversal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution t=new Solution();
        Node head=t.traverse(arr);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

}


