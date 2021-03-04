package march3_string_buffer_builder;

public class OddEvenStrings {

	public static void main(String[] args) {
		String sentence = SentenceInput.input();

		int e = 0;
		int o = 0;

		String ar[] = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		String temp;
		for (int i = 0; i < ar.length; i++) {
			if (isEven(ar[i])) {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			} else {
				int middle = ar[i].length() / 2;
				sb.append(ar[i].substring(0, middle)).append(Character.toUpperCase(ar[i].charAt(middle))).append(ar[i].substring(middle + 1)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

	public static boolean isEven(String s) {
		boolean isEven = false;
		if (s.length() % 2 == 0) {
			isEven = true;
		}
		return isEven;
	}
}
