package Control_Flow.Level_3;

import java.util.Scanner;

public class Q_7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (in cm): ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);
    }
}
