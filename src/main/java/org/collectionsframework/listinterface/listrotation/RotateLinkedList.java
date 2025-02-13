/*
Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
 */

package org.collectionsframework.listinterface.listrotation;

import java.util.ArrayList;
import java.util.Collections;

public class RotateLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> a1 =new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        System.out.println("The original Array List is : "+ a1);
        int rotate=2;
        Collections.reverse(a1);
        Collections.reverse(a1.subList(0,rotate));
        Collections.reverse(a1.subList(rotate, a1.size()));
        System.out.println("after rotating array by 2 steps "+ a1);

    }
}