import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students (1-50): ");
        int numberOfStudents = scanner.nextInt();

        //i tried using if but it exit the code after 2-3 invalid input
        //i dont know what was going on

        // using while input validation for number of students
        while (numberOfStudents < 1 || numberOfStudents > 50) {
            System.out.print("Invalid number of students. Please enter a value between 1 and 50: ");
            numberOfStudents = scanner.nextInt();
        }

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            scanner.nextLine();
            System.out.print("Enter the name of student " + (i + 1) + ":  ");
            String name = scanner.nextLine();

            System.out.print("Enter the number of scores for " + name + " (3-5); ");
            int numberOfScores = scanner.nextInt();

            //input validation for score

            while (numberOfScores < 3 || numberOfScores > 5) {
                System.out.print("Invalid number of scores. Please enter a value between 3 and 5; ");
                numberOfScores = scanner.nextInt();
            }
            students[i] = new Student();

            //name and score array
            students[i].name = name;
            students[i].scores = new double[numberOfScores];

            // variable l as index of the score
            for (int l = 0; l < numberOfScores; l++) {
                System.out.print("Enter score " + (l + 1) + ": ");
                double score = scanner.nextDouble();

                // input validation for scores
                while (score < 0 || score > 100) {
                    System.out.print("Invalid score. Please enter a value between 0 and 100:  ");
                    score = scanner.nextDouble();
                }

                students[i].scores[l] = score;
            }

            // calculate average
            students[i].calculateAverage();
            // determine letter grade
            students[i].determineLetterGrade();
        }

        // printing name avg and grade
        System.out.println("\nStudent Grade Report:");
        for (Student student : students) {
            System.out.printf("Student: %s, Average: %.2f, Grade: %c\n",
                    student.name, student.average, student.letterGrade);
        }

        scanner.close();
    }
}
