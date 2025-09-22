package Control_Flow.Level_2;

import java.util.Scanner;

public class Q_13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (positive and less than 100): ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100;

            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}
