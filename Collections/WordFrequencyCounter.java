package collections_mapinterface_package;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        //Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        //Split text into words
        String[] words = text.split("\\s+");

        //Create map to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println(wordCount);
    }
}

