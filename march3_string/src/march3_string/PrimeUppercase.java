package march3_string;

public class PrimeUppercase {

	public static void main(String[] args) {
		String phrase = UserInput.input();
		char[] check = phrase.toLowerCase().toCharArray();
		
		for(int i = 0; i < phrase.length(); i++){
			if(isPrime(i)) {
				check[i] = Character.toUpperCase(check[i]);
			}
		}
		phrase = new String(check);
		System.out.println("Alterd phrase : " + phrase);
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
