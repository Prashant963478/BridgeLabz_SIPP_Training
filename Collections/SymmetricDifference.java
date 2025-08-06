package collections_setinterface_package;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        //Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        //Create copies of both sets
        Set<Integer> symDiff = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        //Remove common elements from both sets
        symDiff.removeAll(set2); //symDiff has elements only in set1
        temp.removeAll(set1);    // temp has elements only in set2

        //Add the unique elements from set2 to symDiff
        symDiff.addAll(temp);

        System.out.println("Symmetric Difference: " + symDiff);
    }
}
