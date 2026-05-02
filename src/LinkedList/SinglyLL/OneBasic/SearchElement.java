package LinkedList.SinglyLL.OneBasic;

import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;
    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
class Solution1 {
    public boolean search(Node2 head, int key) {
        Node2 current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers? ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Empty List.");
            return;
        }
        System.out.println("Enter number 1: ");
        int value = sc.nextInt();
        Node2 head = new Node2(value);
        Node2 tail = head;
        for(int i=2;i<=n;i++){
            System.out.print("Enter number "+i+": ");
            tail.next = new Node2(sc.nextInt());
            tail = tail.next;
        }
        System.out.println("Enter number to search: ");
        int key = sc.nextInt();
        Solution1 s = new Solution1();
        boolean found = s.search(head, key);
        if(found){
            System.out.println("Element found at "+key+" in list.");
        }else {
            System.out.println("Element not found at "+key+"in list. ");
        }
    }
}
