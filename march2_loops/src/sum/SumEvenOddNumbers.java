package sum;

public class SumEvenOddNumbers {
	public static void main(String[] args) {
		int SumEven = 0;
		int SumOdd = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(findEven(i)) {
				SumEven += i;
			}
			if(findOdd(i)) {
				SumOdd += i;
			}
		}
		String Largest = findLargest(SumEven, SumOdd);
		System.out.println("Sum of even numbers between 1 and 100 : " + SumEven);
		System.out.println("Sum of odd numbers between 1 and 100 : " + SumOdd);
		System.out.println("Largest of the sums is " + Largest);
	}
	
	public static boolean findEven(int n) {
		if(n % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean findOdd(int n) {
		if(n % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String findLargest(int even, int odd) {
		String Largest = "OddSum";
		if(even > odd) {
			Largest = "EvenSum";
		}
		return Largest;
	}
}
