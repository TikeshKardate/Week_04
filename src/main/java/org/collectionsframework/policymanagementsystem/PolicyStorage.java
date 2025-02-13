package org.collectionsframework.policymanagementsystem;

import java.util.*;

public class PolicyStorage {
    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    //adding policies
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return hashSet;
    }

    public Set<Policy> getSortedPolicies() {
        return treeSet;
    }
}
