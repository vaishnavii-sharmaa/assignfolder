package String_Day_3;

import java.util.*;

public class Q_24 {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter string " + (i + 1) + ": ");
			arr[i] = sc.nextLine();
		}
		String result = longestCommonPrefix(arr);

		if (result.isEmpty()) {
			System.out.println("No common prefix found.");
		} else {
			System.out.println("Longest Common Prefix: " + result);
		}

	}
}
