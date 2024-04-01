
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<Integer>();
        this.examPoints = new ArrayList<Integer>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {

        if (grades.isEmpty()) {
            return -1;
        }

        int sum = 0;
        double average = 0;

        for (int grade : grades) {
            sum += grade;
            average = (double) sum / grades.size();
        }

        return average;
    }

    public double averageOfPoints() {
        if (examPoints.isEmpty()) {
            return -1;
        }

        int sum = 0;
        double average = 0;

        for (int points : examPoints) {
            sum += points;
            average = (double) sum / examPoints.size();
        }

        return average;
    }
}
