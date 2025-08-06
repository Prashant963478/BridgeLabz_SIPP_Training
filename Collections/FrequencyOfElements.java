package collections_package;

import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
    	
        //Create a list of strings
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        //Create a map to store the frequency of each string
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : fruits) {
            if (frequencyMap.containsKey(fruit)) {
                frequencyMap.put(fruit, frequencyMap.get(fruit) + 1);
            } else {
                frequencyMap.put(fruit, 1);
            }
        }
        System.out.println(frequencyMap);
    }
}
