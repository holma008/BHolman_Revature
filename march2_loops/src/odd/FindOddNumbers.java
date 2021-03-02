package odd;

public class FindOddNumbers {
	public static void main(String[] args) {
		System.out.print("Odd Numbers : ");
		for(int i = 100; i <= 199; i++) {
			if(isOdd(i)) {
				System.out.print(i + " ");
			};
		}
		
	}
	
	public static boolean isOdd(int n) {
		if(n % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
