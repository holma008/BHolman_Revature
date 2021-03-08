package march3_regex;

public class RegexValidation {
	
	public static void main(String[] args) {
		
		String passport = "12943568";
		if(passport.matches("[0-9]{9}")) {
			System.out.println("SSN Valid");
		}
		else {
			System.out.println("SSN invalid");
		}
		
		String SSN = "789-97-9859";
		if(SSN.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("SSN Valid");
		}
		else {
			System.out.println("SSN invalid");
		}
		
		String DL = "E4953785";
		if(DL.matches("[A-Z]{1}[0-9]{7}")) {
			System.out.println("Drivers Liscence Valid");
		}
		else {
			System.out.println("Drivers Liscence Invalid");
		}
	}
}
