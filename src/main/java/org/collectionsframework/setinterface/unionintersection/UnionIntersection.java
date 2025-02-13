/*
Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.
*/

package org.collectionsframework.setinterface.unionintersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        // Define sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Compute Union and Intersection
        Set<Integer> union = UnionAndIntersection.findUnion(set1, set2);
        Set<Integer> intersection = UnionAndIntersection.findIntersection(set1, set2);

        // Print results
        System.out.println(" Union: " + union + ", Intersection: " + intersection);
    }
}

class UnionAndIntersection {
    //Method to find Union manually
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        // Copy set1 into unionSet
        Set<Integer> unionSet = new HashSet<>(set1);

        for (int num : set2) {
            unionSet.add(num);
        }
        return unionSet;
    }

    // Method to find Intersection manually
    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                // If present in both sets, add to intersection
                intersectionSet.add(num);
            }
        }
        return intersectionSet;
    }
}
