public class Student {
    String name;
    double[] scores;
    double average;
    char letterGrade;

    // calculte average score
    public void calculateAverage() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        this.average = sum / scores.length;
    }

    // using if statement for letter grade after avg
    public void determineLetterGrade() {
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
    }
}
