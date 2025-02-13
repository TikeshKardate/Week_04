/*
Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
 */

package org.collectionsframework.listinterface.frequencyofelement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");
        Map<String, Integer> frequencyMap = countFrequency(list);

        System.out.println(frequencyMap);
    }

    public static Map<String, Integer> countFrequency(List<String> list)
    {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list)
        {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

}

