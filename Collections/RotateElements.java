package collections_package;

import java.util.*;

public class RotateElements {
    public static void main(String[] args) {
    	
        //Original list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        //Call the rotate method
        List<Integer> rotatedList = rotateList(numbers, rotateBy);

        System.out.println(rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int rotateBy) {
        int size = list.size();

        rotateBy = rotateBy % size;

        //Create a new list 
        List<Integer> rotated = new ArrayList<>();

        rotated.addAll(list.subList(rotateBy, size));
        
        rotated.addAll(list.subList(0, rotateBy));

        return rotated;
    }
}
