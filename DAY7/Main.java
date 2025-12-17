

import java.util.*;

public class Main {
    static HashMap<Integer, Employee> employees = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if(employees.containsKey(id)) {
            System.out.println("Employee already added!!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        employees.put(id, emp);

        System.out.println("Employee added successfully!!");
    }

    static void viewEmployee() {
        for(Integer Key : employees.keySet()) {
            employees.get(Key).display();
        }
    }

    static void searchEmployee() {
        System.out.print("Enter the employee ID to be searched: ");
        int id = sc.nextInt();

        if(employees.containsKey(id)) {
            System.out.println("Employee Exists!!");
            employees.get(id).display();
        }
        else {
            System.out.println("Employee does not exist!!");
        }
    }

    static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = sc.nextInt();

        if(!employees.containsKey(id)) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);
        employees.put(id, emp);

        System.out.println("Employee data updated successfully!!");
    }

    static void deleteEmployee() {
        System.out.print("Enter the employee ID to delete: ");
        int id = sc.nextInt();

        if(!employees.containsKey(id)) {
            System.out.println("Employee not found.");
            return;
        }

        employees.remove(id);
        System.out.println("Employee deleted succcessfully!!");
    }

    public static void main(String[] args) {
        while (true) { 
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee");
            System.out.println("3. Search employee by ID");
            System.out.println("4. Update employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateEmployee();
                    break;
                case 5:
                    deleteEmployee();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!!");

            }
        }
    }
    
}
