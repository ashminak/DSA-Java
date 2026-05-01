package QueueAndStack;

import java.util.Scanner;

public class ImplementingStackUsingArray {
    int[] arr =  new int[100005];
    int top;
    ImplementingStackUsingArray(){
        top=-1;
    }
    public void push(int x){
        arr[++top]=x;
    }
    public int pop(){
        if(top==-1){
            return -1;
        }else {
            return arr[top--];
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementingStackUsingArray obj = new ImplementingStackUsingArray();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter push or pop: ");
            String val= sc.next();
            if(val.equals("push")){
                System.out.println("Enter element to be pushed: ");
                int x = sc.nextInt();
                obj.push(x);
            }else if(val.equals("pop")){
                System.out.println(obj.pop()+" ");
            }

        }
    }
}
