package Method_Level_3;

import java.util.*;

public class Q_10 {
	public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {

	    return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
	  }

	  public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
	    int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
	    return area == 0;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter x1 : ");
	    int x1 = sc.nextInt();
	    System.out.print("Enter x1 : ");
	    int y1 = sc.nextInt();
	    System.out.print("Enter x2 : ");
	    int x2 = sc.nextInt();
	    System.out.print("Enter y2 : ");
	    int y2 = sc.nextInt();
	    System.out.print("Enter x3 : ");
	    int x3 = sc.nextInt();
	    System.out.print("Enter y3 : ");
	    int y3 = sc.nextInt();

	    if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
	      System.out.println("Points are collinear (Slope Method).");
	    } else {
	      System.out.println("Points are not collinear (Slope Method).");
	    }

	    if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
	      System.out.println("Points are collinear (Area Method).");
	    } else {
	      System.out.println("Points are not collinear (Area Method).");
	    }

	  }
}
