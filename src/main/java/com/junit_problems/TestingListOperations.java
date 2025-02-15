/*
3️⃣ Testing List Operations
Problem:
Create a ListManager class that has the following methods:
addElement(List<Integer> list, int element): Adds an element to a list.
removeElement(List<Integer> list, int element): Removes an element from a list.
getSize(List<Integer> list): Returns the size of the list.
Write JUnit tests to verify that:
✅ Elements are correctly added.
✅ Elements are correctly removed.
✅ The size of the list is updated correctly.

*/

package com.junit_problems;

import java.util.List;

public class TestingListOperations {

    // Adds an element to the list
    public void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    // Removes an element from the list
    public boolean removeElement(List<Integer> list, int element) {
        if (list != null) {
            return list.remove(Integer.valueOf(element));
        }
        return false;
    }

    // Returns the size of the list
    public int getSize(List<Integer> list) {
        return (list != null) ? list.size() : 0;
    }
}