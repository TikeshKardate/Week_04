/*
Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

package org.collectionsframework.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer>set=new LinkedHashSet<>();
        Collections.addAll(set,5,3,7,9,1);
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i:set){
            ans.add(i);
        }
        Collections.sort(ans);
        System.out.println("Original hash set is: "+set);
        System.out.println("Sorted list is: "+ans);



    }
}
