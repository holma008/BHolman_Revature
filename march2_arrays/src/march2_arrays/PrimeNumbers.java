package march2_arrays;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		int ar[] = InitializeArray.array();//separate class used to initialize the array used
		
		System.out.println("printing prime numbers");
		for(int i = 0; i < ar.length; i++) {
			if(isPrime(ar[i])) {
				System.out.print(ar[i] + " ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		int c = 0;
		if(n == 1) {
			return true;
		}
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				c++;
			}
		}
		if(c == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
