class Student {
    int rn;
    String name;
    String std;
    Student(int rn, String name) {
        System.out.println("Student name: " + name);
        System.out.println("Student roll number: " + rn);
    }
}
class topper extends Student {
    topper(String std) {
        super(23, "Madhav");
        System.out.println("Student standard: " + std);

    }
}
public class work1 {
    public static void main(String[] args) {
        topper t1 = new topper("7th");
    }
}
