package Collections_queueinterface_package;

import java.util.*;

class ImplementStackUsingQueue {
	
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Push element onto stack
    public void push(int x) {
    	
        //Enqueue new element into q2
        q2.add(x);

        //Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        //Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    //Pop the top element
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return q1.remove();
    }

    //Return the top element
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        return q1.peek();
    }

    //Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue stack = new ImplementStackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());   
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Top after pop: " + stack.top()); 
    }
}
