package LinkedList.SinglyLL.OneBasic.SlowAndFast;

import org.w3c.dom.Node;

import java.util.Scanner;

class Node6{
    int data;
    Node6 next;
    Node6(int d){
        data=d;
        next=null;
    }
}
class Solution {
    public Node6 Reverse(Node6 head) {
        Node6 prev = null;
        Node6 curr = head;
        while (curr != null) {
            Node6 font = curr.next;
            curr.next = prev;
            prev = curr;
            curr = font;
        }
        return prev;
    }

    public boolean isPalindrome(Node6 head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node6 slow = head;
        Node6 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node6 secondHalf = Reverse(slow.next);
        Node6 firstHalf = head;
        Node6 temp = secondHalf;
        while (temp != null) {
            if (temp.data != firstHalf.data) {
                return false;
            }
            temp = temp.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }
}
public class Palindrome {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of nodes: ");
        if(n==0){
            System.out.println("true");
            return;
        }
        int []arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node6 head=new Node6(arr[0]);
        Node6 temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node6(arr[i]);
            temp=temp.next;
        }
        Solution pal=new Solution();
        boolean result =pal.isPalindrome(head);
        System.out.println(result?"true":"false");
    }


}
