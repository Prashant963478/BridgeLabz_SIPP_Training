package Collections_queueinterface_package;

import java.util.*;

class Patient {
    String name;
    int severity;

    //Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    //Override toString for easy printing
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
    	
        //PriorityQueue with custom comparator to sort by severity
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                return Integer.compare(p2.severity, p1.severity);
            }
        });

        //Add patients
        triageQueue.add(new Patient("Rohit", 3));
        triageQueue.add(new Patient("Ravi", 5));
        triageQueue.add(new Patient("Rahul", 2));

        //Treat patients in order of severity
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p);
        }
    }
}
