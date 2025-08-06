package collections_setinterface_package;

import java.util.*;

public class UnionAndIntersectionOfTwoSets {
    public static void main(String[] args) {
    	
        //Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        //Compute Union
        Set<Integer> union = new HashSet<>(set1); 
        union.addAll(set2);                     

        //Compute Intersection
        Set<Integer> intersection = new HashSet<>(set1); 
        intersection.retainAll(set2);                  

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
