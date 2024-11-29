import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        int choice;

        System.out.println("Welcome to the Student Grade Tracker!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a grade");
            System.out.println("2. Calculate average grade");
            System.out.println("3. Find highest grade");
            System.out.println("4. Find lowest grade");
            System.out.println("5. Display all grades");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the grade to add: ");
                    int grade = scanner.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        grades.add(grade);
                        System.out.println("Grade added successfully!");
                    } else {
                        System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
                    }
                    break;

                case 2:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to calculate average.");
                    } else {
                        double average = calculateAverage(grades);
                        System.out.println("Average grade: " + average);
                    }
                    break;

                case 3:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to find the highest grade.");
                    } else {
                        int highest = findHighest(grades);
                        System.out.println("Highest grade: " + highest);
                    }
                    break;

                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to find the lowest grade.");
                    } else {
                        int lowest = findLowest(grades);
                        System.out.println("Lowest grade: " + lowest);
                    }
                    break;

                case 5:
                    if (grades.isEmpty()) {
                        System.out.println("No grades available to display.");
                    } else {
                        System.out.println("Grades: " + grades);
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
