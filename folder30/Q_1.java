package Control_Flow.Level_3;

import java.util.Scanner;

public class Q_1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The program works only for years >= 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year ");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year ");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year ");
            } else {
                System.out.println(year + " is NOT a Leap Year ");
            }
        }

        if (year >= 1582 && ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )) {
            System.out.println(year + " is a Leap Year ");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}
