package march3_string;

import java.util.Scanner;

public class UserInput {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phrase");
		String input = sc.nextLine();
		return input;
	}
}
