package com.examples.io.stacks;


/**
 * Stack is LIFO datastructure. Push and Pop only happen from top.
 */
public class Stack1 {

    int arr[];
    int capacity;
    int top;



    public Stack1(int capacity) {

        this.arr = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }



    public void push(int item) {

        if(isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = item;
    }


    public int pop() {

        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top--];

    }

    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }


    public boolean isFull() {
        return top == capacity-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for(int i = 0;i<=top;i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();
        System.out.println();
        //Stack Full
       // stack.push(6);

        //Should Return 5
        stack.pop();
        stack.printStack();
        System.out.println();
        //Push should go thru
        stack.push(6);
        stack.printStack();
        System.out.println();

        //Should return 6
        stack.peek();
        stack.printStack();
        System.out.println();

        //pop all elements
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println();

        stack.pop();

        stack.peek();


    }

}
