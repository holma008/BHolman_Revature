package loops;

public class Loops {
	public static void main(String[] args) {
		System.out.print("for loop example : ");
		for(int i = 0; i < 20; i++) {
			System.out.print(i * 2 + " ");
		}
		
		System.out.print("\nwhile loop example : ");
		int i = 0;
		while(i < 10) {
			System.out.print("again ");
			i++;
		}
		
		System.out.print("\ndo while example : ");
		
		do {
			System.out.print("again ");
			i--;
		}while(i > 0);
	}
}
