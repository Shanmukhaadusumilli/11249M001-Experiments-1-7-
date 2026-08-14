import java.io.*;
import java.util.*;

public class Operation {
    public static void main(String[] args) {
        String name1 = "Rahul";
        String name2 = "Rahul";

        System.out.println("Employee 1: " + name1);
        System.out.println("Employee 2: " + name2);

        if (name1.equals(name2))
            System.out.println("Both employees have the same name.");
        else
            System.out.println("Employees have different names.");

        System.out.println("Length of Employee 1: " + name1.length());
        System.out.println("Uppercase: " + name1.toUpperCase());
        System.out.println("Lowercase: " + name1.toLowerCase());
    }
}