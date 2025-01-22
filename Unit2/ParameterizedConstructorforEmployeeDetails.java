
class Employee {
    int id;
    String name;
    double salary;

    Employee(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

public class ParameterizedConstructorforEmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Shreyas", 45000);
        Employee e2 = new Employee(102, "Vallabh", 50000);
        Employee e3 = new Employee(103, "Zeinth", 48000);
        Employee e4 = new Employee(104, "Prachi", 52000);
        Employee e5 = new Employee(105, "Atharva", 47000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        e4.displayDetails();
        e5.displayDetails();
    }
}

