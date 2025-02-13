/*
Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
 */

package org.collectionsframework.setinterface.findsubset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CheckSubSet {
    public static void main(String[] args) {
        HashSet<Integer>child=new LinkedHashSet<>();
        Collections.addAll(child,2,3);
        HashSet<Integer>parent=new LinkedHashSet<>();
        Collections.addAll(parent,1,2,3,4);
        System.out.println("is set1: "+ child +" subset of: "+parent+" ?: "+parent.containsAll(child));
    }
}