package com.examples.io.linkedlists;

import java.util.Stack;

public class PalindromeList {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(1);
        PalindromeList palindromeList = new PalindromeList();
        System.out.println(palindromeList.isPalindrome(node));
        System.out.println(palindromeList.isPalindromeWithoutStack(node));
    }
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();

        while(fast!=null && fast.next!=null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast!=null) {
            slow = slow.next;
        }

        while(slow!=null) {
            if(stack.pop().intValue()!=slow.data) return false;
            slow = slow.next;
        }
        return true;
    }

    public boolean isPalindromeWithoutStack(Node head) {
        Node slow=head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //At the end of this loop slow would be at the middle

        slow = reverse(slow);
        fast = head;
        while(slow!=null) {
            if(slow.data!=fast.data) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        while(current!=null) {
           Node next = current.next;
           current.next =prev;
           prev = current;
           current = next;
        }
        return prev;
    }


}
