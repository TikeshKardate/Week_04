/*
Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
*/

package org.collectionsframework.setinterface.symmetricdiffference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        Collections.addAll(set1,1,2,3);
        Collections.addAll(set2,3,4,5);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int it:set1){
            if(!set2.contains(it)){
                ans.add(it);
            }
        }
        for(int it:set2){
            if(!set1.contains(it)){
                ans.add(it);
            }
        }
        System.out.println("Symmetric difference is: "+ans);
    }
}