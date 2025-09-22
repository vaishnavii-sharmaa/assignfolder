package Method_Level_3;

import java.util.*;

public class Q_12 {
	public static double distance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	  }

	  public static double[] lineEquation(double x1, double y1, double x2, double y2) {
	    double m, b;

	    m = (y2 - y1) / (x2 - x1);
	    b = y1 - m * x1;
	    return new double[] { m, b };
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter x1: ");
	    double x1 = sc.nextDouble();
	    System.out.print("Enter y1: ");
	    double y1 = sc.nextDouble();
	    System.out.print("Enter x2: ");
	    double x2 = sc.nextDouble();
	    System.out.print("Enter y2: ");
	    double y2 = sc.nextDouble();

	    double distance = distance(x1, y1, x2, y2);
	    System.out.println("\nEuclidean Distance between points: " + distance);

	    double[] arr = lineEquation(x1, y1, x2, y2);
	    System.out.println("Equation of Line: y = " + arr[0] + "x + " + arr[1]);

	  }
}
