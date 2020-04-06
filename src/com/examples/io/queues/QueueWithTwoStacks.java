package com.examples.io.queues;

import java.util.Stack;

public class QueueWithTwoStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();


    public void enqueue(int e) {
        s1.push(e);
    }

    public int dequeue() {

        if(s2.empty()) {
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public boolean isQEmpty() {
    return s1.empty() && s2.empty();
    }

    public int size() {
    return s1.size() + s2.size();
    }

    private void printStack(Stack stack) {
        System.out.println(stack.toString());
    }

    public void printS1() {
        printStack(s1);
    }

    public void printS2() {
        printStack(s2);
    }



    public static void main(String[] args) {
        QueueWithTwoStacks queueWithTwoStacks = new QueueWithTwoStacks();
        queueWithTwoStacks.enqueue(1);
        queueWithTwoStacks.enqueue(2);
        queueWithTwoStacks.enqueue(3);
        queueWithTwoStacks.printS1();

        System.out.println(queueWithTwoStacks.dequeue());
        queueWithTwoStacks.printS2();
        System.out.println(queueWithTwoStacks.dequeue());
        queueWithTwoStacks.printS2();
        System.out.println(queueWithTwoStacks.dequeue());
        queueWithTwoStacks.printS2();
    }




}
