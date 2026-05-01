package QueueAndStack;

import java.util.Scanner;

public class ImplementingTwoStackInArray {
    int[] arr;
    int size;
    int top1;
    int top2;
    ImplementingTwoStackInArray(int n){
        size = n;
        int[] arr = new int[size];
        top1=-1;
        top2=n;
    }
    public void push1(int x){
        if(top1<top2-1){
            arr[++top1]=x;
        }else {
            System.out.println("Stack Overflow");
        }
    }
    public void push2(int x){
        if(top1<top2-1){
            arr[--top2]=x;
        }else {
            System.out.println("Stack Overflow");
        }
    }
    public int pop1(){
        if(top1>=0){
            return arr[top1--];
        }else {
            return -1;
        }
    }
    public int pop2(){
        if(top2<size){
            return arr[top2++];
        }else {
            return -1;
        }
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ImplementingTwoStackInArray obj = new ImplementingTwoStackInArray(1000);
       while(true){
           System.out.println("Enter your choice(1/2/3): ");
           int choice=sc.nextInt();
           if(choice==1){
               System.out.println("Enter the stack number one /two: ");
               int stackNumber = sc.nextInt();
               System.out.println("Enter the value: ");
               int value = sc.nextInt();
               if (stackNumber==1){
                   obj.push1(value);
               }else {
                   obj.push2(value);
               }
           }else if(choice==2){
               System.out.println("Enter the stack number one /two: ");
               int stackNumber = sc.nextInt();
               System.out.println("Enter the value: ");
               int value = sc.nextInt();
               if (stackNumber==1){
                   System.out.println(obj.pop1());
               }else if(stackNumber==2){
                   System.out.println(obj.pop2());
               }
           } else if (choice==3) {
               break;
           }
       }
    }
}
