/*
Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.
 */

package org.collectionsframework.listinterface.nthelementfromlast;

import java.util.Collections;
import java.util.LinkedList;

public class NthElementFromLast {
    public static void main(String[] args) {

        LinkedList<Character>list=new LinkedList<>();
        Collections.addAll(list,'a','b','c','d','e');
        Collections.reverse(list);
        int index=2;
        System.out.println("Element from second last is "+list.get(index-1));

    }
}