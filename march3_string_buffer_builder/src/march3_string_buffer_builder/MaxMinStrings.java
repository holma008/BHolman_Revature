package march3_string_buffer_builder;

public class MaxMinStrings {

	public static void main(String[] args) {
		String sentence = SentenceInput.input();
		String ar[] = sentence.split(" ");
		String min = findMin(ar);
		String max = findMax(ar);
		
		System.out.println("Smallest word in the sentence : " + min);
		System.out.println("Largest word in the sentance : " + max);
	}
	
	public static String findMin(String[] ar) {
		int n = 100;
		String min = "";
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].length() < n) {
				n = ar[i].length();
				min = ar[i];
			}
		}
		return min;
	}
	
	public static String findMax(String[] ar) {
		int n = 0;
		String max = "";
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].length() > n) {
				n = ar[i].length();
				max = ar[i];
			}
		}
		return max;
	}
}
