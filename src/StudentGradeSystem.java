import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];
    double average;
    String grade;

    // Method to input student details
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("        Student Grade Management System");
        System.out.println("--------------------------------------------------");

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    // Method to calculate average and grade
    public void calculateResult() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        average = sum / 3.0;

        if (average >= 80) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    // Method to display student report
    public void displayReport() {
        System.out.println("\n==================================================");
        System.out.println("                  Student Report");
        System.out.println("==================================================");
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Average    : " + average);
        System.out.println("Grade      : " + grade);
        System.out.println("==================================================");
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        Student s = new Student();

        s.inputDetails();
        s.calculateResult();
        s.displayReport();
    }
}

