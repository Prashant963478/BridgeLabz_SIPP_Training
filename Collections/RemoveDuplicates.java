package collections_package;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //Original list with duplicates
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        //Call method to remove duplicates
        List<Integer> result = removeDuplicatesPreserveOrder(numbers);

        System.out.println(result);
    }

    public static List<Integer> removeDuplicatesPreserveOrder(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();        
        List<Integer> output = new ArrayList<>();    

        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                output.add(num);
            }
        }
        return output;
    }
}
