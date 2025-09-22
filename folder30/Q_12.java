package Control_Flow.Level_2;

import java.util.Scanner;

public class Q_12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();
        if (number < 0 || power < 0) {
            System.out.println("Invalid input! Please enter positive integers only.");
        } else {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
    }
}
