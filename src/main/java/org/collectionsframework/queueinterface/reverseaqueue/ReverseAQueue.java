/*
Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
 */

package org.collectionsframework.queueinterface.reverseaqueue;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class ReverseAQueue {
    public static void main(String[] args) {
        //Creating a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //Printing the original queue
        System.out.println("Original Queue: " + queue);

        //Creating an object of ReverseQueue to call the reverseAQueue method
        ReverseQueue rq = new ReverseQueue();

        //Reversing the queue
        Queue<Integer> reversedQueue = rq.reverseAQueue(queue);

        //Printing the reversed queue
        System.out.println("Reversed Queue: " + reversedQueue);
    }
}

class ReverseQueue {
    public <T> Queue<T> reverseAQueue(Queue<T> queue){
        Stack<T> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        return queue;
    }
}
