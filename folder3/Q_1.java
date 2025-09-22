package Method_Level_1;

import java.util.*;

public class Q_1 {
	public static double calculateSimpleInterest(double principal, double rate, double time) {
	    return (principal * rate * time) / 100;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter Principal amount: ");
	    double principal = sc.nextDouble();

	    System.out.print("Enter Rate of Interest (%): ");
	    double rate = sc.nextDouble();

	    System.out.print("Enter Time (in years): ");
	    double time = sc.nextDouble();

	    double interest = calculateSimpleInterest(principal, rate, time);

	    System.out.println("The Simple Interest is " + interest +
	        " for Principal " + principal +
	        ", Rate of Interest " + rate +
	        " and Time " + time);
	  }
}
