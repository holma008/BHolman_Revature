package march2_arrays;

import java.util.Scanner;

public class InitializeArray {
	public static int[] array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What size of array?");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " integers");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}
}