package Collections_queueinterface_package;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
    	
        //Create queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        //Reverse queue
        reverse(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        //Remove all elements from queue and push to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        //Pop from stack and add back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
