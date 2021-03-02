package march2_arrays;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int ar[] = InitializeArray.array();
		int sumEven = 0;

		for (int i = 0; i < ar.length; i++) {
			if(isEven(ar[i])) {
				sumEven += ar[i];
			}
		}
		
		System.out.println("Sum of all even numbers: " + sumEven);
	}
	
	public static boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
