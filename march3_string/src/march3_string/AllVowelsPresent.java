package march3_string;

public class AllVowelsPresent {

	public static void main(String[] args) {
		String phrase = UserInput.input();
		String check = phrase.toLowerCase();//lowercase to make checks easier
		check = check.replaceAll(" ", "");//get rid of any white spaces
		
		final char[] vowels = {'u', 'o', 'i', 'e', 'a'};//constant vowels to check
		int found = 0;
		
		for(char c : vowels) {
			if(seachForVowel(c, check))
				found++;//if all vowels are found final count is 5
		}
		
		if(found == 5) {
			System.out.println("Phrase contains all vowels");
		}
		else {
			System.out.println("Phrase does not contain all vowels");
		}
	}
	
	public static boolean seachForVowel(char vowel, String check) {
		char[] chars = check.toCharArray();
		boolean contains = false;
		
		for(char c : chars) {
			if(c == vowel) {//check each letter of constant char[] to see if it appears in inputed phrase
				contains = true;
				break;
			}
		}
		return contains;
	}
}
