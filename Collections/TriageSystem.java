package collections;

import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class TriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        pq.add(new Patient("Sudarsam", 3));
        pq.add(new Patient("Sridharan", 5));
        pq.add(new Patient("krish", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name); // Alice, John, Bob
        }
    }
}

