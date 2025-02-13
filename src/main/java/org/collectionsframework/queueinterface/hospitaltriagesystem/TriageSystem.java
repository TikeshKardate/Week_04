package org.collectionsframework.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;

public class TriageSystem {
    private PriorityQueue<Patient> queue;

    public TriageSystem() {
        this.queue = new PriorityQueue<>(new SeverityComparator());
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public String processPatients() {
        StringBuilder result = new StringBuilder();

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            result.append(patient.getName());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(".");
        return result.toString();
    }
}