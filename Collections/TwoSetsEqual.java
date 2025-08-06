package collections_setinterface_package;

import java.util.*;

public class TwoSetsEqual {
    public static void main(String[] args) {
    	
        //Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        //Compare the sets 
        boolean areEqual = set1.equals(set2);
        System.out.println("Are both sets equal? " + areEqual);
    }
}
