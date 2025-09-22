package Array;

import java.util.Scanner;

public class Q_9 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];

	        System.out.println("Enter elements :");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        int[] array = new int[rows * cols];
	        int index = 0;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[index] = matrix[i][j];
	                index++;
	            }
	        }

	 
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }

	        sc.close();
	    }
}
