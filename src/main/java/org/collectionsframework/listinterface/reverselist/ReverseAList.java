/*
Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
*/

package org.collectionsframework.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseAList {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        LinkedList <Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println("The Original Array List is : "+list1);
        reversedArrayList(list1);
        System.out.println("The Reversed Array List is : " +list1 );

        System.out.println();

        System.out.println("The Original Linked List is : "+list2);
        reversedLinkedList(list2);
        System.out.println("The Reversed Linked List is : " +list2 );



    }

    public static void reversedArrayList(ArrayList<Integer> list1)
    {


        int start = 0;
        int end = list1.size() - 1;

        while (start < end)
        {
            int temp = list1.get(start);
            list1.set(start, list1.get(end));
            list1.set(end, temp);
            start++;
            end--;
        }
    }

    public static void reversedLinkedList(LinkedList<Integer> list2)
    {

        int start = 0;
        int end = list2.size() - 1;

        while (start < end) {
            int temp = list2.get(start);
            list2.set(start, list2.get(end));
            list2.set(end, temp);
            start++;
            end--;
        }
    }
}
