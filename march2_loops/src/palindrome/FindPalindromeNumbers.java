package palindrome;

public class FindPalindromeNumbers {
     public static void main(String[] args) {
    	 System.out.println("Palindrome numbers : ");
    	 for(int i = 100; i <= 999; i++) {
 			if(isPalendrome(i)) {
				System.out.print(i + " ");
			};
    	 }
     }
     
     public static boolean isPalendrome(int n) {
    	 if((n / 100) == (n % 10)) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
}
