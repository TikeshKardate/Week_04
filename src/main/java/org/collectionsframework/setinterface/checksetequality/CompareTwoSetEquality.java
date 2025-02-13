/*
* Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
*/

package org.collectionsframework.setinterface.checksetequality;

import java.util.Collections;
import java.util.HashSet;


public class CompareTwoSetEquality {
    public static void main(String[] args) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        Collections.addAll(set1,1,2,3);
        Collections.addAll(set2,3,2,1);


        System.out.println("Two sets are equal? "+set1.equals(set2));



    }
}