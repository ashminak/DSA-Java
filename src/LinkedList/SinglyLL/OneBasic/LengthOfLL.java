package LinkedList.SinglyLL.OneBasic;

import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
    }
}
class Solution2 {
    public int Solve(Node3 head) {
        int count = 0;
        Node3 temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class LengthOfLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter? ");
        int x = sc.nextInt();
        Node3 head = null;
        Node3 tail = null;
        for(int i=0;i<x;i++) {
            System.out.println("Enter Node "+(i+1)+":");
            int n = sc.nextInt();
            Node3 newNode = new Node3(n);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }else  {
                tail.next = newNode;
                tail = newNode;
            }
        }
        Solution2 obj = new Solution2();
        int cnt = obj.Solve(head);
        System.out.println(cnt);

    }

}
