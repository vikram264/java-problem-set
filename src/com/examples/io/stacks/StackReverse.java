package com.examples.io.stacks;

import java.util.Iterator;
import java.util.Stack;

//https://www.javaguides.net/2018/09/how-to-reverse-stack-in-java.html
public class StackReverse {

    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        // Remove bottom element from stack
        int bottom = popBottom(stack);
        System.out.println("bottom in reverse stack "+bottom);
        // Reverse everything else in stack
        reverseStack(stack);
        System.out.println("Add original bottom element to top of stack"+bottom);
        // Add original bottom element to top of stack
        stack.push(bottom);
    }


    private int popBottom(Stack<Integer> stack) {
        System.out.println("inside pop pop bottom" );
        int k = 0;
       int top = stack.pop();
        System.out.println("top is" + top);
        if (stack.isEmpty()) {
            // If we removed the last element, return it
            System.out.println("top iin is empty call" + top);
            return top;
        } else {
            // We didn't remove the last element, so remove the last element from what remains

            System.out.println("k "+ ++k);
            System.out.println("calling pop bottom");
            int bottom = popBottom(stack);
            System.out.println("pushing the top value in else "+ top);
            // Since the element we removed in this function call isn't the bottom element,
            // add it back onto the top of the stack where it came from

            stack.push(top);
            return bottom;
        }
    }

    private static void printStack(Stack<Integer> stack){
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            int t = (int) iterator.next();
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //stack.push(40);

       // System.out.println("Stack elements before reverse");
       // printStack(stack);
        StackReverse reversal = new StackReverse();
        reversal.reverseStack(stack);

      //  System.out.println("Stack after before reverse");
        //printStack(stack);
    }
}
