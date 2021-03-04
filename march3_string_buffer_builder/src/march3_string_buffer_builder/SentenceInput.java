package march3_string_buffer_builder;

import java.util.Scanner;

public class SentenceInput {
	
	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = sc.nextLine();
		return input;
	}
}
