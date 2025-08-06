package collections_setinterface_package;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
    	
        //Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));            
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));      

        //Check if set2 contains all elements of set1
        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
