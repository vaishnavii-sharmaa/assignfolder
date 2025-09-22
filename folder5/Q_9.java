package Method_Level_2;

import java.util.*;

public class Q_9 {
	 public static boolean isPositive(int number) {
		    return number >= 0;
		  }

		  public static boolean isEven(int number) {
		    return number % 2 == 0;
		  }

		  public static int compare(int num1, int num2) {
		    if (num1 > num2)
		      return 1;
		    else if (num1 == num2)
		      return 0;
		    else
		      return -1;
		  }

		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int[] numbers = new int[5];

		    System.out.println("Enter 5 numbers:");
		    for (int i = 0; i < numbers.length; i++) {
		      numbers[i] = sc.nextInt();
		    }

		    for (int i = 0; i < numbers.length; i++) {
		      if (isPositive(numbers[i])) {
		        System.out.print(numbers[i] + " is Positive and ");
		        if (isEven(numbers[i])) {
		          System.out.println("Even");
		        } else {
		          System.out.println("Odd");
		        }
		      } else {
		        System.out.println(numbers[i] + " is Negative");
		      }
		    }

		    int result = compare(numbers[0], numbers[numbers.length - 1]);
		    if (result == 1) {
		      System.out.println("First number is greater than last number.");
		    } else if (result == 0) {
		      System.out.println("First number is equal to last number.");
		    } else {
		      System.out.println("First number is less than last number.");
		    }
		  }
}
