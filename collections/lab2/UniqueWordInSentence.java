package com.uttara.collections.lab2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordInSentence {

	static void printUniqueWords(String str)
    {

        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        String[] words = str.split("\\W");
 
        for (String word : words) {
            if (map.containsKey(word)) {
 
                //  Increment its value by one using map.get() method
                map.put(word, map.get(word) + 1);
            }
            // Else store the word inside map with value one
            else
                map.put(word, 1);
        }
 
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
 
            if (entry.getValue() == 1)
                System.out.println(entry.getKey());
        }
    }
 
    public static void main(String[] args)
    {
        // Custom input string
        String str = "Welcome to hello hello world";
 
        // Calling the Method1 to
        // print all unique words in above string
        printUniqueWords(str);
    }

}
