/*
Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
 */

package org.collectionsframework.queueinterface.hospitaltriagesystem;

public class Main {
    public static void main(String[] args) {
        TriageSystem triage = new TriageSystem();

        // Adding patients
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        // Processing patients

        System.out.println("Order of treatment:");
        System.out.println(triage.processPatients());
    }
}