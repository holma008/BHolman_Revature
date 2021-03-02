package march2_arrays;

import java.util.Arrays;

public class MaxMinNumbers {

	public static void main(String[] args) {
		int ar[] = InitializeArray.array();
		int minValue = findMin(ar);
		int maxValue = findMax(ar);
		
		System.out.println("Arrays util method");
		Arrays.sort(ar);
		System.out.println("Max value in array: " + ar[ar.length-1]);
		System.out.println("Min value in array: " + ar[0]);
		
		System.out.println("\nCustom method");
		System.out.println("Max value in array: " + maxValue);
		System.out.println("Min value in array: " + minValue);
	}
	
	public static int findMax(int[] ar) {
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] ar) {
		int min = 100;
		for (int i = 0; i < ar.length; i++) {
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		return min;
	}
}
