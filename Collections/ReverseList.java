package collections_package;

import java.util.*;

public class ReverseList {

    //Generic method to reverse any List
    public static <T> void reverseList(List<T> list) {
        int left = 0;                   
        int right = list.size() - 1;   

        while (left < right) {
        	
            //Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
    	
        //Creating an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);

        reverseList(arrayList);

        System.out.println("Reversed ArrayList: " + arrayList);

        //Creating a LinkedList 
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("\nOriginal LinkedList: " + linkedList);

        reverseList(linkedList);

        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
