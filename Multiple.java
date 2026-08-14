interface Sports {
    void sports();
}

interface Academics {
    void academics();
}

class Student implements Sports, Academics {
    String name;
    int s, a;

    Student(String n, int s, int a) {
        name = n;
        this.s = s;
        this.a = a;
    }

    public void sports() {
        System.out.println("Sports: " + s);
    }

    public void academics() {
        System.out.println("Academic: " + a);
    }

    void display() {
        System.out.println("Name: " + name);
        sports();
        academics();
        System.out.println("Total: " + (s + a));
    }
}

public class Multiple {
    public static void main(String[] args) {
        new Student("Ravi", 80, 90).display();
    }
}