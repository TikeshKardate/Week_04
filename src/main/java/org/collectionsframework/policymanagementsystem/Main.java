/*
Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
Policies.
 */

package org.collectionsframework.policymanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Obj of the class

        //Adding members with policy
        PolicyStorage storage=new PolicyStorage();

        storage.addPolicy(new Policy("P001", "Vivek", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        storage.addPolicy(new Policy("P002", "Vikas", new Date(System.currentTimeMillis() + 500000000), "Auto", 600.0));
        storage.addPolicy(new Policy("P003", "Varsha", new Date(System.currentTimeMillis() + 200000000), "Home", 700.0));
        storage.addPolicy(new Policy("P001", "Savi", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        storage.addPolicy(new Policy("P001", "Savi", new Date(System.currentTimeMillis() + 1000000000), "Health", 500.0));
        //call method to get all the policies
        Set<Policy> policies = storage.getAllPolicies();
        //to display all the policies
        PolicyService.displayAllPolicies(policies);
        System.out.println();

        PolicyService.displayExpiringSoon(storage.getSortedPolicies());
        System.out.println();
        //by id
        PolicyService.displayByCoverageType(policies, "Health");
        //method to find duplicate policies
        PolicyService.findDuplicatePolicies(policies);
    }
}