package march2_arrays;

public class PalindromeNumbers {

	public static void main(String[] args) {
		int ar[] = InitializeArray.array();
		
		System.out.println("Palindrome Numbers: ");
		for (int i = 0; i < ar.length; i++) {
			if(isPalendrome(ar[i])) {
				System.out.print(ar[i] + " ");
			}
		}
	}
	
	public static boolean isPalendrome(int n) {
		int r, swap = 0;
		int temp = n;
		
		while(temp > 0) {
			r = temp % 10; //get remainder
			swap = (swap * 10) + r; //used to reverse number passed into function
			temp /= 10;
		}
		//compare number passed from array to itself reversed
		if(n == swap) {
			return true;
		}
		else {
			return false;
		}
	}
}
