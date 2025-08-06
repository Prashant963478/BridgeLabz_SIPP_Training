package Collections_queueinterface_package;

import java.util.*;

class CircularBuffer {
    int[] buffer;
    int size;
    int start = 0;
    int count = 0;

    // Constructor
    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    //Insert element into buffer
    public void insert(int value) {
        int index = (start + count) % size;

        if (count == size) {
            //Buffer is full, overwrite oldest
            buffer[start] = value;
            start = (start + 1) % size;
        } else {
            //Insert at the next index
            buffer[index] = value;
            count++;
        }
    }

    //Print the buffer elements in order
    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            int index = (start + i) % size;
            System.out.print(buffer[index]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();  

        cb.insert(4);       
        cb.printBuffer();  

        cb.insert(5);       
        cb.printBuffer();  
    }
}
