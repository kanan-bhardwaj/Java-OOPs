class Student {

    String name;
    int rollNo;

    void display() {
        System.out.println(name + " " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Kanan";
        s1.rollNo = 101;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rollNo = 102;

        s1.display();
        s2.display();
    }
}
