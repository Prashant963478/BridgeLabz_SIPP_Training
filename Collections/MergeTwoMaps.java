package collections_mapinterface_package;

import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {
    	
        //Create two maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        //Merge map2 into map1
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            map1.put(key, map1.getOrDefault(key, 0) + value);
        }
        System.out.println("Merged Map: " + map1);
    }
}
