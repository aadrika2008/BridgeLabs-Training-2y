package com.gla.String.level3;
import java.util.*;

public class BMI {static String[] findBMI(double weight, double height) {

    height = height / 100; // cm to meter

    double bmi = weight / (height * height);

    String status;

    if (bmi < 18.5)
        status = "Underweight";
    else if (bmi < 25)
        status = "Normal";
    else if (bmi < 30)
        status = "Overweight";
    else
        status = "Obese";

    return new String[]{
            String.valueOf(height),
            String.valueOf(weight),
            String.valueOf(Math.round(bmi * 100.0) / 100.0),
            status
    };
}

    static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            String[] bmi = findBMI(data[i][0], data[i][1]);

            result[i][0] = bmi[0];
            result[i][1] = bmi[1];
            result[i][2] = bmi[2];
            result[i][3] = bmi[3];
        }

        return result;
    }

    static void display(String[][] data) {

        System.out.println("\nPerson\tHeight(m)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            data[i][0] + "\t\t" +
                            data[i][1] + "\t\t" +
                            data[i][2] + "\t" +
                            data[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }

}
