package march2_arrays;

import java.util.Arrays;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int ar[] = InitializeArray.array();
		
		Arrays.sort(ar);
		System.out.println("Second highest number in the array is " + ar[ar.length - 2]);
	}
}
