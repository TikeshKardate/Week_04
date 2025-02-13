/*
Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
 */

package org.collectionsframework.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class RemoveDuplicateWhilePreservingOrder {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println("Original Array is : "+arr);
        HashMap<Integer,Integer>mp=new HashMap<>();
        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()) {
            int temp = it.next();
            if (mp.containsKey(temp)) {
                it.remove(); // Safe removal using iterator
            } else {
                mp.put(temp, 1);
            }
        }

        System.out.println("After removing duplicate elements arrayList is : "+arr);

    }
}