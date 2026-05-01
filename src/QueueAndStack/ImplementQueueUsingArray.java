package QueueAndStack;

import java.util.Scanner;

public class ImplementQueueUsingArray {
    int[] arr = new int[100005];
    int front,rear;
    ImplementQueueUsingArray(){
        front = 0;
        rear = 0;
    }
    public void push(int x){
        arr[rear++] = x;
    }
    public int pop(){
        if(front == rear){
            return -1;
        }
        return  arr[front++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementQueueUsingArray q = new ImplementQueueUsingArray();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter value 1 (push)or 2(pop): ");
            int x = sc.nextInt();
            if(x==1){
                System.out.println("Enter value 1 (push): ");
                int s = sc.nextInt();
                q.push(s);
            } else if (x==2) {
                System.out.println(q.pop()+" ");
            }
        }
    }
}
