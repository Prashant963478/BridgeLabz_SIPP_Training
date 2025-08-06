package collections_package;

import java.util.*;

public class NthElementFromEnd {
    public static void main(String[] args) {
    	
        //Create linked list
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;

        String result = findNthFromEnd(list, N);
        System.out.println(result);
    }

    public static String findNthFromEnd(LinkedList<String> list, int N) {
    	
        //Create two pointers
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        //Move fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return "List is shorter than N elements";
            }
        }

        //Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }
}
