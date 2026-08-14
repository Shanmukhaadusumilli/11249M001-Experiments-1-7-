class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    Marks(int r, String n, int a, int b, int c, int d, int e) {
        super(r, n);
        m1=a; m2=b; m3=c; m4=d; m5=e;
    }
}

class Result extends Marks {
    Result(int r, String n, int a, int b, int c, int d, int e) {
        super(r,n,a,b,c,d,e);
    }

    void display() {
        int total = m1+m2+m3+m4+m5;
        double avg = total/5.0;
        char grade = avg>=90?'A':avg>=75?'B':avg>=60?'C':avg>=50?'D':'F';

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Result r = new Result(101, "Ravi", 85, 90, 78, 88, 92);
        r.display();
    }
}