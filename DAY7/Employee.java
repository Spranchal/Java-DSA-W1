public class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(
            "ID: " + id + 
            ", Name: " + name + 
            ", Department: " + department + 
            ", Salary: " + salary
        );
    }
}
