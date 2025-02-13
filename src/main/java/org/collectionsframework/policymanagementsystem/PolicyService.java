package org.collectionsframework.policymanagementsystem;

import java.util.*;

public class PolicyService {
    //method to display all the policies
    public static void displayAllPolicies(Set<Policy> policies) {
        System.out.println("All Policies:");
        for (Policy policy : policies) {
            System.out.println(policy);
        }
    }

    //method to display policies according to their expiry date
    public static void displayExpiringSoon(Set<Policy> policies) {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        System.out.println("Policies expiring within 30 days:");
        for (Policy policy : policies) {
            if (policy.expiryDate.before(thresholdDate)) {
                System.out.println(policy);
            }
        }
    }

    //Display policies by coverage type
    public static void displayByCoverageType(Set<Policy> policies, String type) {
        System.out.println("Policies with coverage type: " + type);
        for (Policy policy : policies) {
            if (policy.coverageType.equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    //method to find duplicate policies
    public static void findDuplicatePolicies(Set<Policy> policies) {
        Map<String, Integer> policyCount = new HashMap<>();
        for (Policy policy : policies) {
            policyCount.put(policy.policyNumber, policyCount.getOrDefault(policy.policyNumber, 0) + 1);
        }

        System.out.println("Duplicate Policies:");
        for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " - Duplicates: " + entry.getValue());
            }
        }
    }
}