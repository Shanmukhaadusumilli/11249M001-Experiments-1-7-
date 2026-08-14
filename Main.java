import java.io.*;
import java.util.*;

class Student {
    String name;
    int rollNo, marks;

    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);

        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else if (marks >= 50)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 85);
        Student s2 = new Student("Priya", 102, 92);

        s1.display();
        s2.display();
    }
}