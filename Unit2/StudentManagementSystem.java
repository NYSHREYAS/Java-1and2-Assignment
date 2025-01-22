class Student {
    int id;
    String name;
    double marks;

    Student(int studentId, String studentName, double studentMarks) {
        id = studentId;
        name = studentName;
        marks = studentMarks;
    }


    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}


public class StudentManagementSystem {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Shreyas", 85.5);
        Student s2 = new Student(2, "Vallabh", 92.0);
        Student s3 = new Student(3, "Zeinth", 78.5);
        Student s4 = new Student(4, "Prachi", 95.0);
        Student s5 = new Student(5, "Atharva", 88.0);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
        s5.displayDetails();
    }
    }





