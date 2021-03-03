package march3_string;

public class VowelCount {

	public static void main(String[] args) {
		
		String phrase = UserInput.input();
		String check = phrase.toLowerCase();//makes everything lower to make check easier
		int count = 0;
		for(int i = 0; i < check.length(); i++) {//check each char to see if it is a vowel
			char c = check.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;//increment count
			}
		}
		
		System.out.println("Number of vowels in inputed phrase = " + count);//output count
	}
}
