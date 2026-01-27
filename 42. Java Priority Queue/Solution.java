// https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String s, double cgpa) {
        this.id = id;
        this.name = s;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pQueue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getID)
        );

        for (String enter : events) {
            String[] eventParts = enter.split(" ");
            if (eventParts[0].equalsIgnoreCase("ENTER")) {
                pQueue.add(
                    new Student(
                        Integer.parseInt(eventParts[3]),
                        eventParts[1],
                        Double.parseDouble(eventParts[2])
                    )
                );
            } else if (eventParts[0].equals("SERVED")) {
                pQueue.poll();
            }
        }

        List<Student> remainingStudentsList = new ArrayList<>();
        while (!pQueue.isEmpty()) {
            remainingStudentsList.add(pQueue.poll());
        }
        return remainingStudentsList;
    }
}

public class Solution {

    private static final Scanner scan = new Scanner(System.in);
    private static final Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
