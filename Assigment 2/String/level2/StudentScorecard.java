package com.gla.String.level2;
import java.util.*;

public class StudentScorecard {static int[][] generateScores(int students) {

    int[][] scores = new int[students][3];

    for (int i = 0; i < students; i++) {

        scores[i][0] = (int)(Math.random() * 90) + 10;
        scores[i][1] = (int)(Math.random() * 90) + 10;
        scores[i][2] = (int)(Math.random() * 90) + 10;
    }

    return scores;
}

    static double[][] calculateResult(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0]
                    + scores[i][1]
                    + scores[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;

            result[i][1] =
                    Math.round(average * 100.0) / 100.0;

            result[i][2] =
                    Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    static String[][] calculateGrade(double[][] result) {

        String[][] grade = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 90)
                grade[i][0] = "A";
            else if (percentage >= 80)
                grade[i][0] = "B";
            else if (percentage >= 70)
                grade[i][0] = "C";
            else if (percentage >= 60)
                grade[i][0] = "D";
            else if (percentage >= 50)
                grade[i][0] = "E";
            else
                grade[i][0] = "F";
        }

        return grade;
    }

    static void displayScorecard(int[][] scores,
                                 double[][] result,
                                 String[][] grade) {

        System.out.println(
                "\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {

            System.out.println(
                    (i + 1) + "\t"
                            + scores[i][0] + "\t"
                            + scores[i][1] + "\t\t"
                            + scores[i][2] + "\t"
                            + (int)result[i][0] + "\t"
                            + result[i][1] + "\t"
                            + result[i][2] + "%\t\t"
                            + grade[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);

        double[][] result = calculateResult(scores);

        String[][] grade = calculateGrade(result);

        displayScorecard(scores, result, grade);
    }

}
