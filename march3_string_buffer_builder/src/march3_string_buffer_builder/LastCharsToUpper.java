package march3_string_buffer_builder;

public class LastCharsToUpper {

	public static void main(String[] args) {
		String sentence = SentenceInput.input();
		
		String ar[] = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < ar.length; i++) {
			int wordLength = ar[i].length();
			sb.append(ar[i].substring(0, wordLength - 1)).append(Character.toUpperCase(ar[i].charAt(wordLength - 1))).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
