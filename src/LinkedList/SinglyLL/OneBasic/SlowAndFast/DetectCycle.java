package LinkedList.SinglyLL.OneBasic.SlowAndFast;

import java.util.Scanner;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class DetectCycle {
    public boolean canDetectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
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
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<n;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        temp.next=head.next;
        DetectCycle detect=new DetectCycle();
        boolean res=detect.canDetectCycle(head);
        System.out.println(res);
    }
}
