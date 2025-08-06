package Collections_queueinterface_package;

import java.util.*;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        int N = 5;

        //Generate binary numbers
        List<String> binaryNumbers = generateBinaryNumbers(N);

        System.out.println("First " + N + " Binary Numbers: " + binaryNumbers);
    }

    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
        	
            //Get the front element from the queue
            String current = queue.remove();

            //Add it to the result list
            result.add(current);

            //Enqueue next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }
}
