package collections_setinterface_package;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
    	
        //Create HashSet of integers
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        //Convert set to list
        List<Integer> sortedList = new ArrayList<>(numberSet);

        //Sort the list
        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}
